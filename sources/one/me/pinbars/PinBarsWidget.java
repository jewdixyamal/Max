package one.me.pinbars;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/pinbars/PinBarsWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "a0b", "pinbars_release"}, k = 1, mv = {2, 0, 0})
public final class PinBarsWidget extends Widget {
    public static final /* synthetic */ int t0 = 0;
    public eb9 X;
    public pea Y;
    public k5f Z;
    public ywe a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public bh6 s0;

    public PinBarsWidget() {
        this((Bundle) null, 1, (z84) null);
    }

    public final xza m0() {
        return (xza) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setId(mea.h);
        linearLayout.setShowDividers(7);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        v3c.y(new xh0((Object) shapeDrawable, (Continuation) null, 29), linearLayout);
        shapeDrawable.setIntrinsicHeight(tu0.F(((double) fk4.d().getDisplayMetrics().density) * 0.5d));
        linearLayout.setDividerDrawable(shapeDrawable);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.X = null;
        this.Z = null;
        this.Y = null;
        this.s0 = null;
        m0().Y.h();
        ywe ywe = this.a;
        if (ywe != null) {
            ywe.dismiss();
        }
        this.a = null;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view;
        od2.L(new zn5(m0().Z, new g0b(view, (Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(m0().x0, new h0b(view, (Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(new ap8(m0().y0, this, 5), new i0b((Continuation) null, this), 5), getViewLifecycleScope());
        w7c w7c = m0().u0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new c0b(view, (Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().v0, getViewLifecycleOwner().Q(), fg7), new d0b((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(od2.s(m0().x0, m0().Z, m0().s0, m0().u0, new j0b(view, (Continuation) null, this)), getViewLifecycleScope());
        od2.L(new zn5(m0().z0, new k0b((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().t0, getViewLifecycleOwner().Q(), fg7), new e0b((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public PinBarsWidget(String str, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r2 == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PinBarsWidget(android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            r3.<init>(r4, r0, r1, r2)
            if (r4 == 0) goto L_0x0016
            java.lang.String r0 = "arg_key_scope_id"
            android.os.Parcelable r4 = r4.getParcelable(r0)
            suc r4 = (defpackage.suc) r4
            if (r4 == 0) goto L_0x0014
            java.lang.String r2 = r4.a
        L_0x0014:
            if (r2 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r2 = ""
        L_0x0018:
            s4a r4 = new s4a
            r0 = 22
            r4.<init>(r0)
            java.lang.Class<wza> r0 = defpackage.wza.class
            je7 r4 = r3.m82getSharedViewModelcp94BC8(r2, r0, r4)
            r3.b = r4
            yza r4 = new yza
            r0 = 2
            r4.<init>(r3, r0)
            jp8 r0 = new jp8
            r1 = 14
            r0.<init>(r1, r4)
            java.lang.Class<xza> r4 = defpackage.xza.class
            je7 r4 = r3.createViewModelLazy(r4, r0)
            r3.c = r4
            yza r4 = new yza
            r0 = 3
            r4.<init>(r3, r0)
            je7 r4 = defpackage.tu0.r(r0, r4)
            r3.o = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.pinbars.PinBarsWidget.<init>(android.os.Bundle):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PinBarsWidget(Bundle bundle, int i, z84 z84) {
        this((i & 1) != 0 ? null : bundle);
    }
}
