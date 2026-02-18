package com.example.guard;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MainService extends Service {
    // এখানে Firebase থেকে কমান্ড আসবে:
    // 1. 'take_photo' -> ক্যামেরা এক্সেস করবে
    // 2. 'start_record' -> অডিও এক্সেস করবে
    // 3. 'check_geo' -> লোকেশন সীমানার বাইরে গেলে এলার্ট দিবে
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }
    @Override public IBinder onBind(Intent intent) { return null; }
}
