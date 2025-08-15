package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;

/* renamed from: ceg  reason: default package */
public final class ceg extends fc9 {
    public final Context b;
    public final /* synthetic */ ee6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ceg(ee6 ee6, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 2);
        this.c = ee6;
        this.b = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            int i = fe6.a;
            ee6 ee6 = this.c;
            Context context = this.b;
            int b2 = ee6.b(context, i);
            int i2 = pe6.e;
            if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 9) {
                Intent a = ee6.a(b2, context, "n");
                ee6.f(context, b2, a == null ? null : PendingIntent.getActivity(context, 0, a, 201326592));
            }
        }
    }
}
