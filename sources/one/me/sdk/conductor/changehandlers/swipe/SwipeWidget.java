package one.me.sdk.conductor.changehandlers.swipe;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lone/me/sdk/arch/Widget;", "Lnge;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "conductor_release"}, k = 1, mv = {2, 0, 0})
public abstract class SwipeWidget extends Widget implements nge {
    public static final /* synthetic */ int c = 0;
    public final String a = "SwipeWidget";
    public boolean b;

    public SwipeWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
    }

    public static void s0(uu3 uu3) {
        for (znc e : uu3.getChildRouters()) {
            Iterator it = e.e().iterator();
            while (true) {
                if (it.hasNext()) {
                    coc coc = (coc) it.next();
                    uu3 uu32 = coc.a;
                    Method method = (Method) cv3.d.T0((Object) null, cv3.a[2]);
                    if (method != null) {
                        method.invoke(uu32, new Object[]{Boolean.TRUE});
                        s0(coc.a);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
            }
        }
    }

    public boolean handleBack() {
        return this.b || super.handleBack();
    }

    public final uu3 m0() {
        coc coc = (coc) x53.j0(y53.L(getRouter().e()) - 1, getRouter().e());
        uu3 uu3 = coc != null ? coc.a : null;
        if (uu3 == null) {
            String str = this.a;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.Z, str, "No underlying controller! Swiping won't work properly", (Throwable) null);
            }
        }
        return uu3;
    }

    public boolean n0() {
        return !(this instanceof ChatMediaViewerScreen);
    }

    public void o0() {
    }

    public final void onChangeEnded(zu3 zu3, av3 av3) {
        super.onChangeEnded(zu3, av3);
        wge wge = null;
        if (!S()) {
            String str = this.a;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, str, "onChangeEnded: swipe is disabled", (Throwable) null);
                return;
            }
            return;
        }
        View view = getView();
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                uu3 m0 = m0();
                a81 a81 = m0 == null ? null : new a81(m0, this, viewGroup, 14);
                if (a81 != null && av3.b) {
                    String str2 = this.a;
                    ir6 ir62 = hm9.m;
                    if (ir62 != null && ir62.c()) {
                        ir62.d(us7.X, str2, "onChangeEnded: setup swipe callbacks on new view", (Throwable) null);
                    }
                    boolean z = view instanceof wge;
                    if (z) {
                        rge rge = new rge(u0(), new rzd(7, this), view, viewGroup, a81, n0() ? 2 : 1);
                        rge.q = this;
                        rge.r = t0();
                        if (z) {
                            wge = (wge) view;
                        }
                        if (wge != null) {
                            wge.setOnTouch(new om8(1, rge, rge.class, "onTouchEvent", "onTouchEvent(Landroid/view/MotionEvent;)Z", 0, 17));
                            wge.setOnRequestInterceptTouchEvent(new e09(0, rge, rge.class, "resetDraggingState", "resetDraggingState()V", 0, 12));
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("'To' view must realize SwipeTouchHandler for work".toString());
                }
            }
        }
    }

    public void onChangeStarted(zu3 zu3, av3 av3) {
        super.onChangeStarted(zu3, av3);
        if (!av3.b) {
            View view = getView();
            wge wge = view instanceof wge ? (wge) view : null;
            if (wge != null) {
                wge.setOnTouch((m56) null);
                wge.setOnRequestInterceptTouchEvent((k56) null);
            }
        }
    }

    public void p0() {
    }

    public void q0() {
    }

    public void r0() {
    }

    public Long t0() {
        return null;
    }

    public Integer u0() {
        return null;
    }
}
