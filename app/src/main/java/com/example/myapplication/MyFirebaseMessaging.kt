import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import com.example.myapplication.R
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody



class MyFirebaseMessaging : FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        // Extract data from notification
        val title = remoteMessage.data["title"]
        val message = remoteMessage.data["message"]

        // Create notification
        val notificationBuilder = NotificationCompat.Builder(this, "channel_id")
            .setSmallIcon(R.drawable.arrow)
            .setContentTitle(title)
            .setContentText(message)
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_HIGH)

        // Show notification
        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(0, notificationBuilder.build())
    }

    val httpClient = OkHttpClient()
    val json = MediaType.parse("application/json; charset=utf-8")
    val requestBody = """
{
    "notification": {
        "title": "New news!",
        "body": "Check out the latest news on our app"
    },
    "condition": "'all' in topics"
}
"""
    val request = Request.Builder()
        .url("https://fcm.googleapis.com/v1/projects/<my-application-29a85>/messages:send")
        .addHeader("Authorization", "Bearer <AAAATi6i0jg:APA91bFjmN4HPsjeRV5xdv8rmginqfEsynziR6w5y4Xg1-u_Wmt0_FYMIRhXLrBiPTfAB0mI5arqia-VLwecLosXsq6hD_Siu4DCfVzaAoDQXU3sIAFmjT6UiaEdoXUHjKZJSONGNnFn>")
        .addHeader("Content-Type", "application/json")
        .post(RequestBody.create(json, requestBody))
        .build()

    val response= httpClient.newCall(request).execute()


}

