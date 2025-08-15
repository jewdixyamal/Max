package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: re8  reason: default package */
public final class re8 extends ffe implements a66 {
    public File X;
    public String Y;
    public int Z;
    public final /* synthetic */ te8 s0;
    public final /* synthetic */ zp7 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public re8(te8 te8, zp7 zp7, Continuation continuation) {
        super(2, continuation);
        this.s0 = te8;
        this.t0 = zp7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((re8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new re8(this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        File file;
        String str;
        File file2;
        String str2;
        tx3 tx3 = tx3.a;
        int i = this.Z;
        te8 te8 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            file = ((kk5) ((zi5) te8.Y.getValue())).q(String.valueOf(System.currentTimeMillis()));
            Uri N = j47.N(this.t0.b.toString());
            str = file.getAbsolutePath();
            if (N != null) {
                this.X = file;
                this.Y = str;
                this.Z = 1;
                if (te8.q(te8, file, N, this) == tx3) {
                    return tx3;
                }
                file2 = file;
                str2 = str;
            }
            pnf.o(te8.v0, new ke8(Uri.fromFile(file), str));
            return e5f.a;
        } else if (i == 1) {
            str2 = this.Y;
            file2 = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j47.c0((y7d) te8.Z.getValue(), str2, str2);
        j47.a0((y7d) te8.Z.getValue(), str2);
        file = file2;
        str = str2;
        pnf.o(te8.v0, new ke8(Uri.fromFile(file), str));
        return e5f.a;
    }
}
