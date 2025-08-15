package ru.ok.messages.video.fetcher.youtube.js;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import java.util.concurrent.atomic.AtomicReference;

public class JavaScriptInterface {
    public final die a;

    public JavaScriptInterface(die die) {
        this.a = die;
    }

    @JavascriptInterface
    @Keep
    public void returnResultToJava(String str) {
        die die = this.a;
        v9g v9g = (v9g) ((AtomicReference) die.c).getAndSet((Object) null);
        if (v9g != null) {
            ((Handler) die.o).post(new h76(str, 9, v9g));
        }
    }
}
