package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: zj0  reason: default package */
public final class zj0 implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ zj0(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((ck0) this.c).v0.x(this.b, 4);
                return;
            case 1:
                tu0 tu0 = (tu0) ((mfe) this.c).a;
                if (tu0 != null) {
                    tu0.w(this.b);
                    return;
                }
                return;
            case 2:
                ((MaterialCalendar) this.c).s1.B0(this.b);
                return;
            case 3:
                ((SystemForegroundService) this.c).X.cancel(this.b);
                return;
            case 4:
                ((RecyclerView) this.c).B0(this.b);
                return;
            default:
                ((kdg) this.c).f(this.b);
                return;
        }
    }

    public zj0(RecyclerView recyclerView, int i) {
        this.a = 4;
        this.b = i;
        this.c = recyclerView;
    }

    public zj0(ck0 ck0) {
        this.a = 0;
        this.c = ck0;
        this.b = -1;
    }
}
