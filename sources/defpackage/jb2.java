package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: jb2  reason: default package */
public final class jb2 extends ffe implements a66 {
    public final /* synthetic */ zb2 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jb2(zb2 zb2, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.X = zb2;
        this.Y = str;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jb2(this.X, this.Y, this.Z, continuation);
    }

    /* JADX INFO: finally extract failed */
    public final Object o(Object obj) {
        od2.a0(obj);
        String str = zb2.K0;
        alc e = this.X.e();
        e.getClass();
        xlc a = xlc.a(2, "SELECT COUNT(*) FROM folder_and_chats WHERE folderId = ? AND chatId = ?");
        boolean z = true;
        String str2 = this.Y;
        if (str2 == null) {
            a.W(1);
        } else {
            a.f(1, str2);
        }
        a.j(2, this.Z);
        ilc ilc = e.a;
        ilc.b();
        Cursor o = ilc.o(a, (CancellationSignal) null);
        try {
            long j = o.moveToFirst() ? o.getLong(0) : 0;
            o.close();
            a.n();
            if (j == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            o.close();
            a.n();
            throw th;
        }
    }
}
