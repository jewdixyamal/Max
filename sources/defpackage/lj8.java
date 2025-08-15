package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: lj8  reason: default package */
public final /* synthetic */ class lj8 implements pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ lj8(oh8 oh8, int i, int i2) {
        this.a = i2;
        this.b = oh8;
        this.c = i;
    }

    public final void accept(Object obj) {
        wf7 wf7;
        sad sad;
        int i = this.c;
        oh8 oh8 = this.b;
        int i2 = -1;
        switch (this.a) {
            case 0:
                try {
                    wf7 = (wf7) ((bm7) obj).get();
                    fm9.i(wf7, "LibraryResult must not be null");
                } catch (CancellationException e) {
                    z04.d0("Library operation cancelled", e);
                    String str = wf7.g;
                    iad iad = new iad("no error message provided", 1, Bundle.EMPTY);
                    wf7 = new wf7(iad.a, SystemClock.elapsedRealtime(), (oc8) null, iad, (Object) null, 4);
                } catch (InterruptedException | ExecutionException e2) {
                    z04.d0("Library operation failed", e2);
                    String str2 = wf7.g;
                    iad iad2 = new iad("no error message provided", -1, Bundle.EMPTY);
                    wf7 = new wf7(iad2.a, SystemClock.elapsedRealtime(), (oc8) null, iad2, (Object) null, 4);
                }
                try {
                    nh8 nh8 = oh8.d;
                    fm9.l(nh8);
                    nh8.f(i, wf7);
                    return;
                } catch (RemoteException e3) {
                    z04.d0("Failed to send result to browser " + oh8, e3);
                    return;
                }
            default:
                try {
                    sad = (sad) ((bm7) obj).get();
                    fm9.i(sad, "SessionResult must not be null");
                } catch (CancellationException e4) {
                    z04.d0("Session operation cancelled", e4);
                    sad = new sad(1);
                } catch (InterruptedException | ExecutionException e5) {
                    z04.d0("Session operation failed", e5);
                    if (e5.getCause() instanceof UnsupportedOperationException) {
                        i2 = -6;
                    }
                    sad = new sad(i2);
                }
                sj8.M0(oh8, i, sad);
                return;
        }
    }
}
