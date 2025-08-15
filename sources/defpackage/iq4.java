package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: iq4  reason: default package */
public final class iq4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jq4 b;

    public /* synthetic */ iq4(jq4 jq4, int i) {
        this.a = i;
        this.b = jq4;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                jq4 jq4 = this.b;
                iq4.super.setVisible(false, false);
                ArrayList arrayList = jq4.Y;
                if (arrayList != null && !jq4.Z) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((le) it.next()).a(jq4);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                jq4 jq4 = this.b;
                ArrayList arrayList = jq4.Y;
                if (arrayList != null && !jq4.Z) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((le) it.next()).b(jq4);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
