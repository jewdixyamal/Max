package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: xq8  reason: default package */
public final class xq8 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, nr8 {
    public wq8 a;
    public tc b;
    public ql7 c;

    public final void c(wq8 wq8, boolean z) {
        tc tcVar;
        if ((z || wq8 == this.a) && (tcVar = this.b) != null) {
            tcVar.dismiss();
        }
    }

    public final boolean o(wq8 wq8) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ql7 ql7 = this.c;
        if (ql7.Z == null) {
            ql7.Z = new pl7(ql7);
        }
        this.a.q(ql7.Z.getItem(i), (or8) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.c(this.a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        wq8 wq8 = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                wq8.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return wq8.performShortcut(i, keyEvent, 0);
    }
}
