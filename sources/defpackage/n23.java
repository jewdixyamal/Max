package defpackage;

import android.content.Context;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;

/* renamed from: n23  reason: default package */
public final class n23 {
    public final /* synthetic */ o23 a;

    public n23(o23 o23) {
        this.a = o23;
    }

    @uae
    public final void onEvent(nu7 nu7) {
        o23 o23 = this.a;
        try {
            xie xie = (xie) ((je7) o23.X).getValue();
            xie.getClass();
            sa3 sa3 = new sa3(0, new vpc((lx3) hz4.a, new rie(xie, (Continuation) null)));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ztc a2 = muc.a();
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(a2, "scheduler is null");
            new gb3(sa3, timeUnit, a2).a();
        } catch (Exception e) {
            try {
                hm9.p((String) o23.b, "error while delete token", e);
            } catch (Throwable th) {
                ((av0) ((je7) o23.c).getValue()).f(this);
                throw th;
            }
        }
        ProcessPhoenix.b((Context) o23.a);
        ((av0) ((je7) o23.c).getValue()).f(this);
    }
}
