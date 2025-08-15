package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: w30  reason: default package */
public final class w30 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ x30 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w30(x30 x30, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = x30;
        this.a = contentResolver;
        this.b = uri;
    }

    public final void onChange(boolean z) {
        x30 x30 = this.c;
        x30.d(t30.b((Context) x30.b, (h30) x30.u0, (g40) x30.t0));
    }
}
