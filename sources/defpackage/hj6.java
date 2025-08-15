package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Debug;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: hj6  reason: default package */
public final class hj6 extends ffe implements a66 {
    public File X;
    public int Y;
    public final /* synthetic */ ij6 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hj6(ij6 ij6, Continuation continuation) {
        super(2, continuation);
        this.Z = ij6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hj6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hj6(this.Z, continuation);
    }

    public final Object o(Object obj) {
        File file;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        ij6 ij6 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            File i2 = ((kk5) ij6.c.getValue()).i("oneme_heap_dump.hprof");
            Debug.dumpHprofData(i2.getAbsolutePath());
            cx7 immediate = ((w9a) ((kke) ij6.b.getValue())).c().getImmediate();
            gj6 gj6 = new gj6(ij6, i2, (Continuation) null);
            this.X = i2;
            this.Y = 1;
            if (j47.t0(immediate, gj6, this) == tx3) {
                return tx3;
            }
            file = i2;
        } else if (i == 1) {
            file = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Context context = (Context) ij6.a.getValue();
        Uri f = ((kk5) ij6.c.getValue()).f(context, file);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.STREAM", f);
        Intent createChooser = Intent.createChooser(intent, (CharSequence) null);
        createChooser.addFlags(268435456);
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(createChooser, 65536)) {
            context.grantUriPermission(resolveInfo.activityInfo.packageName, f, 3);
        }
        context.startActivity(createChooser);
        return e5f.a;
    }
}
