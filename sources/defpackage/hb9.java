package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: hb9  reason: default package */
public final class hb9 extends ffe implements a66 {
    public final /* synthetic */ zy X;
    public final /* synthetic */ t68 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hb9(zy zyVar, t68 t68, Continuation continuation) {
        super(2, continuation);
        this.X = zyVar;
        this.Y = t68;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hb9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hb9(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        try {
            return this.X.d();
        } catch (FileNotFoundException unused) {
            String c = this.Y.c();
            zy zyVar = this.X;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                File file = zyVar.c;
                ir6.d(us7, c, "file " + file + " not found", (Throwable) null);
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Throwable th) {
            hm9.p(this.Y.c(), "load failed", th);
            return null;
        }
    }
}
