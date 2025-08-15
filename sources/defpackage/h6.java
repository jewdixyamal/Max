package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: h6  reason: default package */
public final class h6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.K0 = null;
                actionBarOverlayLayout.x0 = false;
                return;
            case 11:
                ((xof) this.b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.K0 = null;
                actionBarOverlayLayout.x0 = false;
                return;
            case 1:
                sf sfVar = (sf) this.b;
                ArrayList arrayList = new ArrayList(sfVar.X);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((le) arrayList.get(i)).a(sfVar);
                }
                return;
            case 2:
                super.onAnimationEnd(animator);
                ck0 ck0 = (ck0) this.b;
                y7f k = mqd.k(ck0);
                Iterator it = ck0.z0.iterator();
                while (it.hasNext()) {
                    ((ViewOverlay) k.b).remove((uwe) it.next());
                }
                return;
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                bottomSheetBehavior.L(5);
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.U.get()).requestLayout();
                    return;
                }
                return;
            case 4:
                qs4 qs4 = (qs4) this.b;
                qs4.q();
                qs4.r.start();
                return;
            case 5:
                in5 in5 = ((jn5) this.b).u0;
                if (in5 != null) {
                    in5.a();
                    return;
                }
                return;
            case 6:
                ((HideBottomViewOnScrollBehavior) this.b).h = null;
                return;
            case 8:
                a18 a18 = (a18) this.b;
                a18.b.setTranslationY(0.0f);
                a18.b(0.0f);
                return;
            case 9:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                sideSheetBehavior.y(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    return;
                }
                return;
            case 10:
                ((w1f) this.b).n();
                animator.removeListener(this);
                return;
            case 11:
                ((xof) this.b).c();
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 7:
                super.onAnimationRepeat(animator);
                oh7 oh7 = (oh7) this.b;
                oh7.Z = (oh7.Z + 1) % oh7.Y.c.length;
                oh7.s0 = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                sf sfVar = (sf) this.b;
                ArrayList arrayList = new ArrayList(sfVar.X);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((le) arrayList.get(i)).b(sfVar);
                }
                return;
            case 11:
                ((xof) this.b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public h6(xof xof, View view) {
        this.a = 11;
        this.b = xof;
    }
}
