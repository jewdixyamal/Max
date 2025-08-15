package defpackage;

import android.view.View;
import java.util.Collections;

/* renamed from: wu2  reason: default package */
public final class wu2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xu2 b;

    public /* synthetic */ wu2(View view, xu2 xu2, int i) {
        this.a = i;
        this.b = xu2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                xu2 xu2 = this.b;
                ((l67) xu2.c.getValue()).a("show", "main", "invite_friends");
                if (xu2.X) {
                    xu2.a.q0(xu2);
                    return;
                }
                return;
            case 1:
                ys2.a.b().b(Collections.singletonList(new dta(1)));
                xu2 xu22 = this.b;
                if (xu22.o) {
                    xu22.a.q0(xu22);
                    return;
                }
                return;
            default:
                xu2 xu23 = this.b;
                if (((Boolean) xu23.b.invoke()).booleanValue()) {
                    ys2.a.b().b(Collections.singletonList(new dta(1)));
                    if (xu23.o) {
                        xu23.a.q0(xu23);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
