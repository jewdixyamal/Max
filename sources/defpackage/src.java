package defpackage;

import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: src  reason: default package */
public final class src extends ffe implements a66 {
    public final /* synthetic */ File X;
    public final /* synthetic */ trc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public src(File file, trc trc, Continuation continuation) {
        super(2, continuation);
        this.X = file;
        this.Y = trc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((src) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new src(this.X, this.Y, continuation);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [ho9, vuc, java.lang.Object] */
    public final Object o(Object obj) {
        od2.a0(obj);
        File file = this.X;
        ? obj2 = new Object();
        obj2.b = file;
        obj2.c = Environment.DIRECTORY_MOVIES;
        obj2.a = 8;
        obj2.d = MediaStore.Video.Media.getContentUri("external_primary");
        trc trc = this.Y;
        return ((yd) trc.a).c(obj2, trc.a.a());
    }
}
