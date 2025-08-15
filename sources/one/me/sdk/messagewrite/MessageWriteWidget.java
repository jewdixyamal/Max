package one.me.sdk.messagewrite;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/sdk/messagewrite/MessageWriteWidget;", "Lone/me/sdk/arch/Widget;", "Luc7;", "Lxt3;", "Lev8;", "Lu33;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
public final class MessageWriteWidget extends Widget implements uc7, xt3, ev8, u33 {
    public static final /* synthetic */ bc7[] F0;
    public xz7 A0;
    public rt3 B0;
    public final q0e C0;
    public ywe D0;
    public int E0;
    public final xp7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final qm0 x0;
    public final q7c y0;
    public final q7c z0;

    static {
        Class<MessageWriteWidget> cls = MessageWriteWidget.class;
        hob hob = new hob(cls, "rootView", "getRootView()Landroid/widget/LinearLayout;", 0);
        oec oec = nec.a;
        F0 = new bc7[]{hob, zr6.e(oec, cls, "container", "getContainer()Landroid/widget/FrameLayout;", 0), zr6.f(cls, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0, oec), zr6.f(cls, "quoteView", "getQuoteView()Lone/me/sdk/uikit/common/chat/QuoteView;", 0, oec), zr6.f(cls, "recordControlsContainer", "getRecordControlsContainer()Landroid/view/ViewGroup;", 0, oec), zr6.f(cls, "recordControlsRouter", "getRecordControlsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oec)};
    }

    public MessageWriteWidget(String str, z84 z84) {
        this(dy7.g(new kpa("arg_scope_id", new suc(str))));
    }

    public static void B0(csb csb, boolean z) {
        ecf ecf;
        int I = i24.I(qqe.e(csb.getTitleView()));
        int i = 0;
        if (z) {
            ecf a2 = qqe.a(csb.getTitleView());
            if ((a2 != null ? a2.a : 0) == I) {
                return;
            }
        }
        if (z) {
            ecf a3 = qqe.a(csb.getTitleView());
            if (a3 != null) {
                i = a3.a;
            }
            if (i != I) {
                ecf = new ecf(csb.getContext(), I, new g27(21));
                qqe.d(csb.getTitleView(), ecf);
            }
        }
        ecf = null;
        qqe.d(csb.getTitleView(), ecf);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [ov8, java.lang.Object] */
    public static final void m0(MessageWriteWidget messageWriteWidget, xy8 xy8) {
        dz8 dz8;
        ez ezVar;
        messageWriteWidget.getClass();
        String str = null;
        CharSequence charSequence = xy8 != null ? xy8.b : null;
        if (xy8 == null) {
            charSequence = null;
        }
        boolean z = false;
        if (xy8 == null) {
            messageWriteWidget.q0().setRightOuterIconActionState(new Object());
            messageWriteWidget.q0().setText((CharSequence) null);
            messageWriteWidget.q0().setRightInnerIconVisible(true);
        } else {
            messageWriteWidget.q0().setRightOuterIconActionState(xy8.d ? mv8.a : nv8.a);
            if (xy8.e) {
                messageWriteWidget.q0().setText((CharSequence) null);
                messageWriteWidget.q0().f(charSequence);
            }
            messageWriteWidget.q0().setRightInnerIconVisible(false);
        }
        messageWriteWidget.w0().r(charSequence);
        messageWriteWidget.z0(xy8 != null ? xy8.c : null);
        qm0 qm0 = messageWriteWidget.x0;
        if (br7.H(qm0)) {
            messageWriteWidget.s0().setCounter((Integer) null);
            if (!(xy8 == null || (dz8 = xy8.c) == null || (ezVar = dz8.d) == null)) {
                str = ezVar.c;
            }
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                messageWriteWidget.s0().setDrawOverlay(true);
            }
            messageWriteWidget.s0().setImageClickListener(new a09(messageWriteWidget, 1));
        } else if (qm0.a()) {
            csb csb = (csb) qm0.getValue();
            messageWriteWidget.s0().setImageClickListener((View.OnClickListener) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: lv8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: lv8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: lv8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n0(one.me.sdk.messagewrite.MessageWriteWidget r5, defpackage.zy8 r6) {
        /*
            r5.getClass()
            r0 = 0
            if (r6 == 0) goto L_0x0009
            dz8 r1 = r6.e
            goto L_0x000a
        L_0x0009:
            r1 = r0
        L_0x000a:
            if (r6 == 0) goto L_0x0013
            bz8 r2 = r6.d
            if (r2 == 0) goto L_0x0013
            java.lang.CharSequence r2 = r2.a
            goto L_0x0014
        L_0x0013:
            r2 = r0
        L_0x0014:
            r3 = 0
            if (r6 == 0) goto L_0x0024
            bz8 r4 = r6.d
            if (r4 == 0) goto L_0x0024
            java.lang.Integer r4 = r4.b
            if (r4 == 0) goto L_0x0024
            int r4 = r4.intValue()
            goto L_0x0025
        L_0x0024:
            r4 = r3
        L_0x0025:
            if (r6 == 0) goto L_0x0029
            bz8 r0 = r6.d
        L_0x0029:
            if (r0 == 0) goto L_0x0047
            sv8 r6 = r5.q0()
            java.lang.CharSequence r6 = r6.getText()
            boolean r6 = defpackage.tpa.f(r6, r2)
            if (r6 != 0) goto L_0x0047
            sv8 r6 = r5.q0()
            r6.setText(r2)
            sv8 r6 = r5.q0()
            r6.h(r4)
        L_0x0047:
            sv8 r6 = r5.q0()
            if (r1 != 0) goto L_0x004e
            r3 = 1
        L_0x004e:
            r6.setRightInnerIconVisible(r3)
            sv8 r6 = r5.q0()
            if (r1 != 0) goto L_0x005d
            kv8 r0 = new kv8
            r0.<init>()
            goto L_0x005f
        L_0x005d:
            lv8 r0 = defpackage.lv8.a
        L_0x005f:
            r6.setRightOuterIconActionState(r0)
            r5.z0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.messagewrite.MessageWriteWidget.n0(one.me.sdk.messagewrite.MessageWriteWidget, zy8):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ov8, java.lang.Object] */
    public static final void o0(MessageWriteWidget messageWriteWidget, dz8 dz8) {
        if (dz8 != null) {
            messageWriteWidget.q0().setRightOuterIconActionState(new Object());
            messageWriteWidget.q0().setRightInnerIconVisible(true);
            if (br7.H(messageWriteWidget.x0) && messageWriteWidget.v0().L0.a.getValue() != null) {
                messageWriteWidget.q0().setText((CharSequence) null);
            }
            messageWriteWidget.z0(dz8);
            return;
        }
        messageWriteWidget.z0(dz8);
    }

    public final void A0() {
        CharSequence text = q0().getText();
        if ((text != null && !w9e.C0(text)) || v0().t()) {
            xz8 v02 = v0();
            bc7[] bc7Arr = xz8.V0;
            v02.B(text, false);
            q0().setText((CharSequence) null);
        }
    }

    public final void C0(eqe eqe, boolean z) {
        csb s02 = s0();
        s02.getLocationOnScreen(new int[2]);
        WindowInsets rootWindowInsets = requireView().getRootWindowInsets();
        int i = 0;
        int i2 = rootWindowInsets != null ? x6g.f((View) null, rootWindowInsets).a.f(7).d : 0;
        int i3 = vc7.a;
        if (vc7.b(vc7.c)) {
            i = vc7.a(getContext());
        }
        Point point = new Point(tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density), rh4.q((float) 4, fk4.d().getDisplayMetrics().density, s0().getHeight() + q0().getHeight() + i2 + i));
        ywe ywe = this.D0;
        if (ywe != null) {
            ywe.dismiss();
        }
        ywe ywe2 = new ywe(getContext(), (View) s02, (k56) new yz8(this, 3), (k56) null, 0, 1, 56);
        ywe2.d(eqe);
        ywe2.e(point, 8388691, z ? 2500 : 800);
        ywe2.setOnDismissListener(new c09(this, 1));
        this.D0 = ywe2;
    }

    public final void D0(csb csb, dz8 dz8) {
        Drawable drawable;
        B0(csb, dz8.c);
        CharSequence b2 = dz8.b.b(csb.getContext());
        if (b2 != null) {
            csb.setTitle(b2);
            csb.setAttachDescription(dz8.d);
            csb.setDrawOverlay(false);
            if (dz8.g) {
                Integer num = dz8.f;
                if (num != null) {
                    drawable = kt3.b(csb.getContext(), num.intValue());
                    if (drawable == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    drawable = null;
                }
                csb.setStartIconDrawable(drawable);
                if (num != null && dz8.a == 3) {
                    xz8 v02 = v0();
                    if (!((t33) ((q33) v02.c.getValue())).g.getBoolean("app.onboarding.author_visibility", false)) {
                        v02.M0.m((Object) null, e5f.a);
                    }
                    csb.setStartIconClickListener(new vu5(this, 18, dz8));
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void O() {
        qv8 qv8 = q0().c;
        qv8.setShowSoftInputOnFocus(true);
        qv8.setOnFocusChangeListener((View.OnFocusChangeListener) null);
    }

    public final void m() {
        q0().e(false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zz8 zz8 = new zz8(this, 3);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(lga.y);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        zz8.invoke(linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ywe ywe = this.D0;
        if (ywe != null) {
            ywe.dismiss();
        }
        this.D0 = null;
        m();
        this.A0 = null;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        int i2 = 0;
        if (i == 160) {
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] == -1) {
                    boolean unused = r0().getClass();
                    return;
                }
                i2++;
            }
        } else if (i == 181) {
            int length2 = iArr.length;
            while (i2 < length2) {
                if (iArr[i2] == -1) {
                    boolean unused2 = r0().getClass();
                    return;
                }
                i2++;
            }
        }
    }

    public final void onViewCreated(View view) {
        boolean z;
        m58 m58 = v0().S0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(m58, getViewLifecycleOwner().Q(), fg7), new i09((Continuation) null, this, view), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new j31(vc7.f, this.C0, new t11(3, (Continuation) null, 2), 4), getViewLifecycleOwner().Q(), fg7), new a19((Continuation) null, this), 5), getViewLifecycleScope());
        sv8 q0 = q0();
        zz8 zz8 = new zz8(this, 5);
        q0.getClass();
        String[] strArr = {"image/webp", "image/jpeg", "image/png", "image/gif", "image/heic"};
        hv8 hv8 = new hv8(zz8);
        WeakHashMap weakHashMap = zmf.a;
        int i = Build.VERSION.SDK_INT;
        qv8 qv8 = q0.c;
        if (i >= 31) {
            wmf.c(qv8, strArr, hv8);
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = false;
                    break;
                } else if (strArr[i2].startsWith("*")) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            c54.j("A MIME type set here must not start with *: " + Arrays.toString(strArr), !z);
            qv8.setTag(twb.tag_on_receive_content_mime_types, strArr);
            qv8.setTag(twb.tag_on_receive_content_listener, hv8);
        }
        yce w02 = w0();
        w02.R0 = new en3(w02, 2, this);
        od2.L(new zn5(tu0.g(q0().getMessageState(), getViewLifecycleOwner().Q(), fg7), new j09((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(q0().getMessagePosition(), new x09((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t03(w0().F0, 11), getViewLifecycleOwner().Q(), fg7), new k09((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(w0().L0, new y09((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t03(w0().J0, 11), getViewLifecycleOwner().Q(), fg7), new l09((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(new t03(((zz7) this.c.getValue()).b, 11), new z09((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(v0().F0, getViewLifecycleOwner().Q(), fg7), new m09((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(v0().B0, getViewLifecycleOwner().Q(), fg7), new n09((Continuation) null, this), 5), getViewLifecycleScope());
        i24.s(new zn5(v0().U0, new w09((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t09(v0().J0, this, 0), getViewLifecycleOwner().Q(), fg7), new o09((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t09(v0().L0, this, 1), getViewLifecycleOwner().Q(), fg7), new p09((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t09(v0().R0, this, 2), getViewLifecycleOwner().Q(), fg7), new q09((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t03(v0().N0, 11), getViewLifecycleOwner().Q(), fg7), new f09((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(v0().T0, getViewLifecycleOwner().Q(), fg7), new g09((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((jac) this.o.getValue()).X, getViewLifecycleOwner().Q(), fg7), new h09((Continuation) null, this), 5), getViewLifecycleScope());
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p0(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.isAttached()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            bc7[] r0 = F0
            r1 = 4
            r2 = r0[r1]
            q7c r3 = r4.y0
            java.lang.Object r2 = r3.T0(r4, r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.setClipChildren(r5)
            r1 = r0[r1]
            java.lang.Object r1 = r3.T0(r4, r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.setClipToPadding(r5)
            r1 = 1
            r2 = r0[r1]
            q7c r3 = r4.v0
            java.lang.Object r2 = r3.T0(r4, r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setClipChildren(r5)
            r0 = r0[r1]
            java.lang.Object r0 = r3.T0(r4, r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setClipToPadding(r5)
            android.widget.LinearLayout r0 = r4.u0()
            r0.setClipChildren(r5)
            android.widget.LinearLayout r0 = r4.u0()
            r0.setClipToPadding(r5)
            android.widget.LinearLayout r0 = r4.u0()
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            r2 = 0
            if (r1 == 0) goto L_0x0059
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x005a
        L_0x0059:
            r0 = r2
        L_0x005a:
            if (r0 == 0) goto L_0x005f
            r0.setClipChildren(r5)
        L_0x005f:
            android.widget.LinearLayout r0 = r4.u0()
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x006e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x006f
        L_0x006e:
            r0 = r2
        L_0x006f:
            if (r0 == 0) goto L_0x0074
            r0.setClipToPadding(r5)
        L_0x0074:
            android.widget.LinearLayout r0 = r4.u0()
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0087
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x0088
        L_0x0087:
            r0 = r2
        L_0x0088:
            if (r0 == 0) goto L_0x008d
            r0.setClipChildren(r5)
        L_0x008d:
            android.widget.LinearLayout r4 = r4.u0()
            android.view.ViewParent r4 = r4.getParent()
            android.view.ViewParent r4 = r4.getParent()
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00a0
            r2 = r4
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x00a0:
            if (r2 == 0) goto L_0x00a5
            r2.setClipToPadding(r5)
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.messagewrite.MessageWriteWidget.p0(boolean):void");
    }

    public final sv8 q0() {
        return (sv8) this.w0.T0(this, F0[2]);
    }

    public final eua r0() {
        return (eua) this.s0.getValue();
    }

    public final csb s0() {
        bc7 bc7 = F0[3];
        return (csb) this.x0.getValue();
    }

    public final j03 t0() {
        return (j03) this.z0.T0(this, F0[5]);
    }

    public final LinearLayout u0() {
        return (LinearLayout) this.u0.T0(this, F0[0]);
    }

    public final xz8 v0() {
        return (xz8) this.a.getValue();
    }

    public final yce w0() {
        return (yce) this.b.getValue();
    }

    public final int x0() {
        boolean b2 = r0().b(eua.l);
        boolean b3 = r0().b(eua.h);
        return (b2 || !b3) ? (b3 || !b2) ? oga.j : oga.d : oga.i;
    }

    public final void y(int i, Bundle bundle) {
        rce rce;
        q0e q0e;
        Object value;
        lce lce = (lce) x53.i0(w0().L0.b());
        if (lce != null && (rce = lce.b) != null) {
            String str = (String) x53.j0(i, rce.Y);
            if (str != null) {
                yce w02 = w0();
                rce rce2 = new rce(rce.a, rce.b, rce.c, str, rce.X, rce.Y, rce.Z);
                do {
                    q0e = w02.I0;
                    value = q0e.getValue();
                    rce rce3 = (rce) value;
                } while (!q0e.c(value, rce2));
            }
            w0().K0.setValue((Object) null);
        }
    }

    public final void y0() {
        xz8 v02 = v0();
        CharSequence text = q0().getText();
        v02.getClass();
        pnf.o(v02.z0, new fz8(text));
        q0().setText((CharSequence) null);
    }

    public final void z0(dz8 dz8) {
        int i = this.E0;
        this.E0 = dz8 != null ? dz8.a : 0;
        qm0 qm0 = this.x0;
        if (dz8 == null && br7.H(qm0)) {
            s0().setVisibility(8);
        } else if (dz8 != null && !br7.H(qm0)) {
            View requireView = requireView();
            LinearLayout linearLayout = requireView instanceof LinearLayout ? (LinearLayout) requireView : null;
            if (linearLayout != null) {
                br7.b(linearLayout, s0(), 0);
            }
            D0(s0(), dz8);
            s0().setVisibility(0);
            q0().requestFocus();
            q0().e(true);
        } else if (dz8 != null) {
            D0(s0(), dz8);
            q0().requestFocus();
            if (i != this.E0) {
                q0().e(true);
            }
        }
    }

    public MessageWriteWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        Class<suc> cls = suc.class;
        Object v = ay7.v(bundle, "arg_scope_id", cls);
        if (v != null) {
            this.a = m82getSharedViewModelcp94BC8(((suc) ((Parcelable) v)).a, xz8.class, (k56) null);
            Object v2 = ay7.v(bundle, "arg_scope_id", cls);
            if (v2 != null) {
                this.b = m82getSharedViewModelcp94BC8(((suc) ((Parcelable) v2)).a, yce.class, (k56) null);
                Object v3 = ay7.v(bundle, "arg_scope_id", cls);
                if (v3 != null) {
                    this.c = m82getSharedViewModelcp94BC8(((suc) ((Parcelable) v3)).a, zz7.class, (k56) null);
                    Object v4 = ay7.v(bundle, "arg_scope_id", cls);
                    if (v4 != null) {
                        this.o = m82getSharedViewModelcp94BC8(((suc) ((Parcelable) v4)).a, jac.class, (k56) null);
                        f9g f9g = f9g.a;
                        this.X = (xp7) f9g.getAccessor().c(xp7.class);
                        this.Y = f9g.getAccessor().d(hp.class);
                        this.Z = f9g.getAccessor().d(qe5.class);
                        this.s0 = f9g.getAccessor().d(eua.class);
                        this.t0 = tu0.r(3, new yz8(this, 0));
                        this.u0 = viewBinding(lga.y);
                        this.v0 = viewBinding(lga.w);
                        this.w0 = viewBinding(xoc.X);
                        this.x0 = binding(new yz8(this, 1));
                        int i = lga.x;
                        this.y0 = viewBinding(i);
                        this.z0 = childSlotRouter(i);
                        this.C0 = r0e.a(Boolean.FALSE);
                        return;
                    }
                    throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
                }
                throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
            }
            throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }
}
