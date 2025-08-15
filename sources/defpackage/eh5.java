package defpackage;

import android.net.Uri;
import one.me.filedownloadwarning.FileDownloadWarningBottomSheet;

/* renamed from: eh5  reason: default package */
public final /* synthetic */ class eh5 implements k64 {
    public final /* synthetic */ String X;
    public final /* synthetic */ Uri Y;
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long o;

    public /* synthetic */ eh5(long j, long j2, String str, long j3, String str2, Uri uri) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.o = j3;
        this.X = str2;
        this.Y = uri;
    }

    public final Object a() {
        return new FileDownloadWarningBottomSheet(this.a, this.b, this.c, this.o, this.X, this.Y.toString());
    }
}
