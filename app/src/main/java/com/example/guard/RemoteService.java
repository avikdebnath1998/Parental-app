package com.example.guard;
import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;

public class RemoteService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        // লাইভ অ্যাপ ইউজ ডিটেইলস এবং স্ক্রিন রিড করার জন্য
    }
    @Override public void onInterrupt() {}
}
