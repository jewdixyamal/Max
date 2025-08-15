package one.me.calllist.ui.page;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/calllist/ui/page/CallHistoryPageScreen;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Lng3;", "<init>", "()V", "Lv81;", "type", "(Lv81;)V", "buc", "call-list_release"}, k = 1, mv = {2, 0, 0})
public final class CallHistoryPageScreen extends Widget implements xt3, ng3 {
    public static final buc u0 = new Object();
    public static final /* synthetic */ bc7[] v0;
    public static final int w0 = 1;
    public final fic X;
    public final qm0 Y;
    public final khe Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public zwe o;
    public final je7 s0;
    public final fs t0;

    /* JADX WARNING: type inference failed for: r1v1, types: [buc, java.lang.Object] */
    static {
        Class<CallHistoryPageScreen> cls = CallHistoryPageScreen.class;
        v0 = new bc7[]{new hob(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), rh4.g(nec.a, cls, "typeArg", "getTypeArg()Ljava/lang/String;")};
    }

    public CallHistoryPageScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        this.a = m82getSharedViewModelcp94BC8("call_history_scope_id", u81.class, (k56) null);
        this.b = createViewModelLazy(m81.class, new s(11, new g81(this, 0)));
        this.c = tu0.r(3, new g81(this, 1));
        this.X = new fic(new g81(this, 2));
        this.Y = binding(new g81(this, 3));
        this.Z = new khe(new g81(this, 4));
        this.s0 = tu0.r(3, new k11(10));
        this.t0 = new fs(String.class, "type_arg");
    }

    public final void h(int i, Bundle bundle) {
        ((rg1) this.c.getValue()).g(i);
    }

    public final v81 m0() {
        Object obj;
        huc huc = v81.b;
        bc7 bc7 = v0[1];
        String str = (String) this.t0.a(this);
        huc.getClass();
        Iterator it = v81.Y.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (tpa.f(((v81) obj).name(), str)) {
                break;
            }
        }
        v81 v81 = (v81) obj;
        return v81 == null ? v81.ALL : v81;
    }

    public final EndlessRecyclerView2 n0() {
        bc7 bc7 = v0[0];
        return (EndlessRecyclerView2) this.Y.getValue();
    }

    public final u81 o0() {
        return (u81) this.a.getValue();
    }

    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        m81 p0 = p0();
        hm9.m("CallHistoryPageViewModel", "unregister load history callbacks for type=" + p0.b, new Object[0]);
        ks1 ks1 = p0.X;
        ks1.getClass();
        ks1.z0.b(new is1(ks1, 4));
        ks1.Y.remove(p0);
    }

    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        p0().s();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        aba aba = (aba) this.X.getValue();
        if (aba != null) {
            frameLayout.addView(aba, -1, -1);
        }
        frameLayout.addView(n0(), -1, -1);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        this.X.reset();
        zwe zwe = this.o;
        if (zwe != null) {
            zwe.B(n0());
        }
    }

    public final void onDismiss() {
        p0().y0 = null;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((rg1) this.c.getValue()).b(i, strArr, iArr);
    }

    public final void onViewCreated(View view) {
        i24.s(new zn5(p0().v0, new h81(this, (Continuation) null), 5), getViewLifecycleScope());
        huc huc = v81.b;
        v81 v81 = p0().b;
        huc.getClass();
        if (v81 == v81.ALL) {
            i24.s(new zn5(p0().x0, new i81(this, (Continuation) null), 5), getViewLifecycleScope());
        }
    }

    public final m81 p0() {
        return (m81) this.b.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r8.longValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            m81 r8 = r6.p0()
            java.lang.Long r8 = r8.y0
            if (r8 == 0) goto L_0x005a
            long r0 = r8.longValue()
            m81 r8 = r6.p0()
            al6 r8 = r8.q(r0)
            if (r8 != 0) goto L_0x0017
            return
        L_0x0017:
            int r2 = w0
            if (r7 != r2) goto L_0x0041
            u81 r7 = r6.o0()
            q0e r2 = r7.Z
        L_0x0021:
            java.lang.Object r7 = r2.getValue()
            r3 = r7
            s81 r3 = (defpackage.s81) r3
            java.util.Map r4 = r3.b
            r3.getClass()
            s81 r3 = new s81
            r5 = 1
            r3.<init>(r4, r5)
            boolean r7 = r2.c(r7, r3)
            if (r7 == 0) goto L_0x0021
            u81 r6 = r6.o0()
            r6.q(r0, r8)
            goto L_0x005a
        L_0x0041:
            if (r7 != 0) goto L_0x005a
            u81 r6 = r6.o0()
            java.util.List r7 = java.util.Collections.singletonList(r8)
            r6.getClass()
            t81 r8 = new t81
            r0 = 0
            r8.<init>(r6, r7, r0)
            r7 = 3
            kotlinx.coroutines.internal.ContextScope r6 = r6.a
            defpackage.j47.T(r6, r0, r0, r8, r7)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calllist.ui.page.CallHistoryPageScreen.y(int, android.os.Bundle):void");
    }

    public CallHistoryPageScreen(v81 v81) {
        this();
        String name = v81.name();
        bc7 bc7 = v0[1];
        this.t0.b(this, name);
    }
}
