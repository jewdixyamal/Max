package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: p9g  reason: default package */
public final class p9g implements uw4 {
    public final Context a;

    public p9g(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context.getApplicationContext();
                return;
            default:
                this.a = context;
                return;
        }
    }

    public void a(tu0 tu0) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new pd3(0, "EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new f5((Object) this, (Object) tu0, (Object) threadPoolExecutor, 27));
    }
}
