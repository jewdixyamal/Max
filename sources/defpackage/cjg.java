package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: cjg  reason: default package */
public final class cjg implements lp, qj3, e1d, bha, tge, l3a {
    public static cjg o;
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ cjg(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static final SharedPreferences i(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void j(Context context) {
        SharedPreferences i = i(context);
        if (!i.edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                "Failed to store app set ID last used time for App ".concat(valueOf);
            }
            throw new Exception("Failed to store the app set ID last used time.");
        }
    }

    public void I(CharSequence charSequence) {
        bha bha = ((xka) ((yka) this.c)).a;
        if (bha != null) {
            bha.I(charSequence);
        }
    }

    public void U() {
        int i;
        int i2;
        ala ala = (ala) this.b;
        if (ala != null) {
            cla cla = ala.a;
            cla.F0 = false;
            int ordinal = cla.getForm().ordinal();
            boolean z = true;
            if (ordinal == 0) {
                kpa actionsHorizontalPadding = cla.getActionsHorizontalPadding();
                i = actionsHorizontalPadding != null ? ((Number) actionsHorizontalPadding.a).intValue() : tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
            } else if (ordinal == 1) {
                kpa actionsHorizontalPadding2 = cla.getActionsHorizontalPadding();
                i = actionsHorizontalPadding2 != null ? ((Number) actionsHorizontalPadding2.a).intValue() : tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
            } else if (ordinal == 2) {
                kpa actionsHorizontalPadding3 = cla.getActionsHorizontalPadding();
                i = actionsHorizontalPadding3 != null ? ((Number) actionsHorizontalPadding3.a).intValue() : tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int ordinal2 = cla.getForm().ordinal();
            if (ordinal2 == 0) {
                kpa actionsHorizontalPadding4 = cla.getActionsHorizontalPadding();
                i2 = actionsHorizontalPadding4 != null ? ((Number) actionsHorizontalPadding4.b).intValue() : tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
            } else if (ordinal2 == 1) {
                kpa actionsHorizontalPadding5 = cla.getActionsHorizontalPadding();
                i2 = actionsHorizontalPadding5 != null ? ((Number) actionsHorizontalPadding5.b).intValue() : tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
            } else if (ordinal2 == 2) {
                kpa actionsHorizontalPadding6 = cla.getActionsHorizontalPadding();
                i2 = actionsHorizontalPadding6 != null ? ((Number) actionsHorizontalPadding6.b).intValue() : tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            cla.setPadding(i, cla.getPaddingTop(), i2, cla.getPaddingBottom());
            View view = cla.C0;
            if (view instanceof eha) {
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginEnd(tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
                        view.setLayoutParams(marginLayoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                View view2 = cla.B0;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
            TextView textView = cla.u0;
            textView.setVisibility(0);
            textView.setWidth(textView.getMeasuredWidth());
            je7 je7 = cla.v0;
            if (je7.a()) {
                fmd fmd = (fmd) je7.getValue();
                if (fmd.getVisibility() != 0) {
                    z = false;
                }
                boolean z2 = cla.E0;
                if (z != z2) {
                    fmd.setVisibility(z2 ? 0 : 8);
                    bc7 bc7 = cla.H0[5];
                    fmd.a(((Boolean) cla.t0.b).booleanValue());
                    cla.l();
                }
            }
            je7 je72 = cla.w0;
            if (je72.a()) {
                ((s5a) je72.getValue()).setVisibility(0);
            }
            je7 je73 = cla.x0;
            if (je73.a()) {
                ((ImageView) je73.getValue()).setVisibility(0);
            }
            OneMeButton oneMeButton = cla.A0;
            if (oneMeButton != null) {
                oneMeButton.setVisibility(0);
            }
        }
        bha bha = ((xka) ((yka) this.c)).a;
        if (bha != null) {
            bha.U();
        }
    }

    public void a() {
        ObjectAnimator objectAnimator = (ObjectAnimator) this.b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.a;
        if (view.getAlpha() < 1.0f) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{view.getAlpha(), 1.0f});
            ofFloat.setDuration(500);
            ofFloat.setInterpolator((AccelerateDecelerateInterpolator) this.c);
            ofFloat.start();
            this.b = ofFloat;
        }
    }

    public void accept(Object obj) {
        gu guVar = (gu) obj;
        hm9.m(gn4.i, "MsgGetCmd success", new Object[0]);
        ((gn4) this.a).c((e52) this.b, (n7d) this.c);
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [u20, ooc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [ooc, java.lang.Object, lvd] */
    /* JADX WARNING: type inference failed for: r6v15, types: [ooc, java.lang.Object, sxd] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ooc b(int r7, byte[] r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x012d
            r0 = 2
            if (r7 != r0) goto L_0x0120
            gy8 r7 = defpackage.vw8.a(r8)     // Catch:{ all -> 0x001a }
            int r0 = r7.v0()     // Catch:{ all -> 0x0029 }
            r1 = 0
            java.lang.Object r2 = r6.a
            o9g r2 = (defpackage.o9g) r2
            switch(r0) {
                case 1: goto L_0x00cf;
                case 2: goto L_0x00a9;
                case 3: goto L_0x008c;
                case 4: goto L_0x0066;
                case 5: goto L_0x005a;
                case 6: goto L_0x002c;
                case 7: goto L_0x0015;
                case 8: goto L_0x001d;
                default: goto L_0x0015;
            }
        L_0x0015:
            r7.close()     // Catch:{ all -> 0x001a }
            r6 = 0
            return r6
        L_0x001a:
            r6 = move-exception
            goto L_0x010b
        L_0x001d:
            java.lang.Object r6 = r6.b     // Catch:{ all -> 0x0029 }
            b9b r6 = (defpackage.b9b) r6     // Catch:{ all -> 0x0029 }
            trf r6 = r6.p(r7)     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x0029:
            r6 = move-exception
            goto L_0x0102
        L_0x002c:
            int r6 = r7.x0()     // Catch:{ all -> 0x0029 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
        L_0x0035:
            if (r1 >= r6) goto L_0x0051
            int r3 = r7.v0()     // Catch:{ all -> 0x0029 }
            bg1 r3 = r2.C(r3)     // Catch:{ all -> 0x0029 }
            int r4 = r7.v0()     // Catch:{ all -> 0x0029 }
            float r4 = (float) r4     // Catch:{ all -> 0x0029 }
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ all -> 0x0029 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0029 }
            int r1 = r1 + 1
            goto L_0x0035
        L_0x0051:
            co9 r6 = new co9     // Catch:{ all -> 0x0029 }
            r6.<init>(r0)     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x005a:
            java.lang.Object r6 = r6.c     // Catch:{ all -> 0x0029 }
            dq1 r6 = (defpackage.dq1) r6     // Catch:{ all -> 0x0029 }
            qkf r6 = r6.b(r7)     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x0066:
            int r6 = r7.s0()     // Catch:{ all -> 0x0029 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
        L_0x006f:
            if (r1 >= r6) goto L_0x0081
            int r3 = r7.v0()     // Catch:{ all -> 0x0029 }
            bg1 r3 = r2.C(r3)     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x007e
            r0.add(r3)     // Catch:{ all -> 0x0029 }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x006f
        L_0x0081:
            sxd r6 = new sxd     // Catch:{ all -> 0x0029 }
            r6.<init>()     // Catch:{ all -> 0x0029 }
            r6.a = r0     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x008c:
            int r6 = r7.v0()     // Catch:{ all -> 0x0029 }
            bg1 r6 = r2.C(r6)     // Catch:{ all -> 0x0029 }
            lvd r0 = new lvd     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
            if (r6 == 0) goto L_0x00a1
            r0.a = r6     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r0
        L_0x00a1:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = "Illegal 'speaker' value: null"
            r6.<init>(r0)     // Catch:{ all -> 0x0029 }
            throw r6     // Catch:{ all -> 0x0029 }
        L_0x00a9:
            int r6 = r7.s0()     // Catch:{ all -> 0x0029 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
        L_0x00b2:
            if (r1 >= r6) goto L_0x00c4
            int r3 = r7.v0()     // Catch:{ all -> 0x0029 }
            bg1 r3 = r2.C(r3)     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x00c1
            r0.add(r3)     // Catch:{ all -> 0x0029 }
        L_0x00c1:
            int r1 = r1 + 1
            goto L_0x00b2
        L_0x00c4:
            u20 r6 = new u20     // Catch:{ all -> 0x0029 }
            r6.<init>()     // Catch:{ all -> 0x0029 }
            r6.a = r0     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x00cf:
            int r6 = r7.x0()     // Catch:{ all -> 0x0029 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
        L_0x00d8:
            if (r1 >= r6) goto L_0x00f2
            java.lang.String r3 = r7.z0()     // Catch:{ all -> 0x0029 }
            fp1 r3 = defpackage.f46.Z(r3)     // Catch:{ all -> 0x0029 }
            int r4 = r7.v0()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x00ef
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0029 }
            r0.put(r4, r3)     // Catch:{ all -> 0x0029 }
        L_0x00ef:
            int r1 = r1 + 1
            goto L_0x00d8
        L_0x00f2:
            java.lang.Object r6 = r2.b     // Catch:{ all -> 0x0029 }
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6     // Catch:{ all -> 0x0029 }
            r6.putAll(r0)     // Catch:{ all -> 0x0029 }
            gt6 r6 = new gt6     // Catch:{ all -> 0x0029 }
            r6.<init>(r0)     // Catch:{ all -> 0x0029 }
            r7.close()     // Catch:{ all -> 0x001a }
            return r6
        L_0x0102:
            r7.close()     // Catch:{ all -> 0x0106 }
            goto L_0x010a
        L_0x0106:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch:{ all -> 0x001a }
        L_0x010a:
            throw r6     // Catch:{ all -> 0x001a }
        L_0x010b:
            ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException r7 = new ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = defpackage.xj6.a(r8)
            java.lang.String r1 = "Unable to decode notification body: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8, r6)
            r7.<init>(r0)
            throw r7
        L_0x0120:
            ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException r6 = new ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "Only binary format is supported"
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        L_0x012d:
            ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException r6 = new ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Illegal 'format' value: null"
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjg.b(int, byte[]):ooc");
    }

    public SpannableStringBuilder c(String str, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (!(charSequence == null || str == null)) {
            je7 je7 = (je7) this.c;
            for (a0d a0d : ((b0d) je7.getValue()).d(charSequence.toString(), ((b0d) je7.getValue()).e(charSequence.toString(), str))) {
                spannableStringBuilder.setSpan(new mse(qp4.u0.b((Context) this.a).i(), new w8c(17)), a0d.a, a0d.b, 17);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r7.length() == 1) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        if (r7 == 0) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        if ((r9 == null || defpackage.w9e.C0(r9)) != false) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0040 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList d(java.util.List r21) {
        /*
            r20 = this;
            r0 = r20
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r21.iterator()
        L_0x000b:
            boolean r3 = r2.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r2.next()
            r6 = r3
            fde r6 = (defpackage.fde) r6
            ybe r7 = r6.a
            int r7 = r7.b
            if (r7 == r4) goto L_0x0021
            goto L_0x0031
        L_0x0021:
            j92 r7 = defpackage.j92.a
            java.lang.Object r8 = r0.b
            j92 r8 = (defpackage.j92) r8
            boolean r6 = r6.b
            if (r8 != r7) goto L_0x002d
            r4 = r6
            goto L_0x0031
        L_0x002d:
            if (r6 != 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r4 = r5
        L_0x0031:
            if (r4 == 0) goto L_0x000b
            r1.add(r3)
            goto L_0x000b
        L_0x0037:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0040:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0104
            java.lang.Object r3 = r1.next()
            fde r3 = (defpackage.fde) r3
            ybe r6 = r3.a
            java.lang.String r7 = r6.h
            java.lang.Object r8 = r0.c
            je7 r8 = (defpackage.je7) r8
            java.lang.String r6 = r6.c
            if (r7 == 0) goto L_0x0066
            int r9 = r7.length()
            if (r9 != 0) goto L_0x005f
            goto L_0x0066
        L_0x005f:
            int r9 = r7.length()
            if (r9 != r4) goto L_0x0066
            goto L_0x0076
        L_0x0066:
            java.lang.Object r9 = r8.getValue()
            b0d r9 = (defpackage.b0d) r9
            boolean r9 = r9.h(r6, r7)
            if (r9 == 0) goto L_0x0076
            android.text.SpannableStringBuilder r6 = r0.c(r7, r6)
        L_0x0076:
            ybe r3 = r3.a
            java.lang.String r7 = r3.h
            java.lang.String r9 = r3.d
            r10 = 0
            if (r7 == 0) goto L_0x0095
            int r11 = r7.length()
            if (r11 != 0) goto L_0x0086
            goto L_0x0095
        L_0x0086:
            int r11 = r7.length()
            if (r11 != r4) goto L_0x0095
            if (r9 == 0) goto L_0x00af
            int r7 = r9.length()
            if (r7 != 0) goto L_0x00b0
            goto L_0x00af
        L_0x0095:
            if (r9 == 0) goto L_0x00af
            int r11 = r9.length()
            if (r11 != 0) goto L_0x009e
            goto L_0x00af
        L_0x009e:
            java.lang.Object r8 = r8.getValue()
            b0d r8 = (defpackage.b0d) r8
            boolean r8 = r8.h(r9, r7)
            if (r8 == 0) goto L_0x00b0
            android.text.SpannableStringBuilder r9 = r0.c(r7, r9)
            goto L_0x00b0
        L_0x00af:
            r9 = r10
        L_0x00b0:
            if (r6 == 0) goto L_0x00bb
            boolean r7 = defpackage.w9e.C0(r6)
            if (r7 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            r7 = r5
            goto L_0x00bc
        L_0x00bb:
            r7 = r4
        L_0x00bc:
            if (r7 == 0) goto L_0x00cd
            if (r9 == 0) goto L_0x00c9
            boolean r7 = defpackage.w9e.C0(r9)
            if (r7 == 0) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r7 = r5
            goto L_0x00ca
        L_0x00c9:
            r7 = r4
        L_0x00ca:
            if (r7 == 0) goto L_0x00cd
            goto L_0x00fd
        L_0x00cd:
            long r12 = r3.a
            if (r6 != 0) goto L_0x00d7
            java.lang.String r6 = "id"
            java.lang.String r6 = defpackage.ey8.h(r12, r6)
        L_0x00d7:
            r14 = r6
            java.lang.String r6 = ""
            if (r9 != 0) goto L_0x00df
            r16 = r6
            goto L_0x00e1
        L_0x00df:
            r16 = r9
        L_0x00e1:
            java.lang.String r7 = r3.f
            if (r7 != 0) goto L_0x00e7
            r15 = r6
            goto L_0x00e8
        L_0x00e7:
            r15 = r7
        L_0x00e8:
            java.lang.String r7 = r3.h
            if (r7 != 0) goto L_0x00ef
            r17 = r6
            goto L_0x00f1
        L_0x00ef:
            r17 = r7
        L_0x00f1:
            nz4 r18 = defpackage.nz4.a
            rce r10 = new rce
            int r3 = r3.b
            r11 = r10
            r19 = r3
            r11.<init>(r12, r14, r15, r16, r17, r18, r19)
        L_0x00fd:
            if (r10 == 0) goto L_0x0040
            r2.add(r10)
            goto L_0x0040
        L_0x0104:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjg.d(java.util.List):java.util.ArrayList");
    }

    public void e(sue sue, oa5 oa5, l3f l3f) {
        this.b = sue;
        l3f.a();
        l3f.b();
        xze B = oa5.B(l3f.e, 5);
        this.c = B;
        B.d((oy5) this.a);
    }

    public void f(yaf yaf) {
        long c2;
        long j;
        np8.g((sue) this.b);
        int i = maf.a;
        sue sue = (sue) this.b;
        synchronized (sue) {
            try {
                long j2 = sue.c;
                c2 = j2 != -9223372036854775807L ? j2 + sue.b : sue.c();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        sue sue2 = (sue) this.b;
        synchronized (sue2) {
            j = sue2.b;
        }
        if (c2 != -9223372036854775807L && j != -9223372036854775807L) {
            oy5 oy5 = (oy5) this.a;
            if (j != oy5.A0) {
                my5 a2 = oy5.a();
                a2.o = j;
                oy5 oy52 = new oy5(a2);
                this.a = oy52;
                ((xze) this.c).d(oy52);
            }
            int c3 = yaf.c();
            ((xze) this.c).c(c3, yaf);
            ((xze) this.c).b(c2, 1, c3, 0, (vze) null);
        }
    }

    public void g() {
        ala ala;
        if (((eha) this.a).w0 && (ala = (ala) this.b) != null) {
            ala.a();
        }
        bha bha = ((xka) ((yka) this.c)).a;
        if (bha != null) {
            bha.g();
        }
    }

    public int h() {
        return rh4.q((float) 12, fk4.d().getDisplayMetrics().density, ((uge) this.b).getMeasuredHeight() - ((r57) this.c).getMeasuredHeight());
    }

    public int k() {
        return ((r57) this.c).getTop();
    }

    public void l(Task task) {
        goc goc = (goc) this.a;
        String str = (String) this.b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.c;
        synchronized (goc.a) {
            goc.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public void m() {
        ((drf) ((VpnPanelWidget) this.a).b.getValue()).b.o(u9f.c);
    }

    public void n() {
        ala ala;
        if (((eha) this.a).w0 && (ala = (ala) this.b) != null) {
            ala.a();
        }
        bha bha = ((xka) ((yka) this.c)).a;
        if (bha != null) {
            bha.n();
        }
    }

    public void onDismiss() {
        ((drf) ((VpnPanelWidget) this.a).b.getValue()).b.o(u9f.c);
    }

    public void p() {
        bha bha = ((xka) ((yka) this.c)).a;
        if (bha != null) {
            bha.p();
        }
    }

    public View q() {
        return (r57) this.c;
    }

    public int y() {
        return ((uge) this.b).getMeasuredHeight();
    }

    public cjg(amf amf) {
        this.a = amf;
        this.c = new AccelerateDecelerateInterpolator();
    }

    public cjg(String str) {
        my5 my5 = new my5();
        my5.k = str;
        this.a = new oy5(my5);
    }
}
