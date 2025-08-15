package defpackage;

import android.os.RemoteException;
import android.util.SparseBooleanArray;

/* renamed from: ni8  reason: default package */
public final /* synthetic */ class ni8 implements Runnable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ si8 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ vi8 c;
    public final /* synthetic */ ri8 o;

    public /* synthetic */ ni8(si8 si8, int i, vi8 vi8, ri8 ri8, boolean z) {
        this.a = si8;
        this.b = i;
        this.c = vi8;
        this.o = ri8;
        this.X = z;
    }

    public final void run() {
        si8 si8 = this.a;
        ii8 ii8 = si8.f;
        if (!ii8.i()) {
            boolean isActive = si8.j.a.a.isActive();
            int i = this.b;
            vi8 vi8 = this.c;
            if (!isActive) {
                StringBuilder n = rh4.n(i, "Ignore incoming player command before initialization. command=", ", pid=");
                n.append(vi8.a.b);
                z04.c0(n.toString());
                return;
            }
            oh8 R = si8.R(vi8);
            if (si8.e.G(R, i)) {
                ii8.s(R);
                ii8.e.getClass();
                try {
                    this.o.b(R);
                } catch (RemoteException e) {
                    z04.d0("Exception in " + R, e);
                }
                if (this.X) {
                    new SparseBooleanArray().append(i, true);
                    ii8.p(R);
                }
            } else if (i == 1 && !ii8.s.u()) {
                z04.c0("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            }
        }
    }
}
