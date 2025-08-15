package defpackage;

import android.view.WindowInsetsController;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: qud  reason: default package */
public final /* synthetic */ class qud implements WindowInsetsController.OnControllableInsetsChangedListener {
    public final /* synthetic */ AtomicBoolean a;

    public /* synthetic */ qud(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        this.a.set((i & 8) != 0);
    }
}
