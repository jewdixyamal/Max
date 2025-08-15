package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import one.me.android.OneMeApplication;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.devmenu.DevMenuScreen;
import one.me.folders.list.FoldersListScreen;
import one.me.settings.media.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.animoji.views.AnimojiTextView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: bk  reason: default package */
public final /* synthetic */ class bk implements a66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        by8 by8;
        by8 by82;
        int i;
        wm9 wm9;
        y9f y9f;
        re6 re6;
        String str = null;
        switch (this.a) {
            case 0:
                AnimojiTextView.j((AnimojiTextView) this.b, (CharSequence) obj, (TextView.BufferType) obj2);
                return e5f.a;
            case 1:
                ((py0) this.b).k((w51) obj, obj2);
                return e5f.a;
            case 2:
                ((wmc) this.b).q(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                return e5f.a;
            case 3:
                ((Long) obj).getClass();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                xl1 xl1 = ((yl1) this.b).G0;
                if (xl1 != null) {
                    yxc yxc = CallScreen.R0;
                    ((ti1) xl1).a.D0().c.h.a(booleanValue);
                }
                return e5f.a;
            case 4:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                ip1.a((ip1) this.b);
                return e5f.a;
            case 5:
                int i2 = ChangeDisabledDialog.y0;
                fg7 fg7 = fg7.o;
                ChangeDisabledDialog changeDisabledDialog = (ChangeDisabledDialog) this.b;
                od2.L(new zn5(tu0.g((mn5) obj, changeDisabledDialog.getViewLifecycleOwner().Q(), fg7), new v12((Continuation) null, (m56) obj2), 5), changeDisabledDialog.getViewLifecycleScope());
                return e5f.a;
            case 6:
                ((fn3) ((a3g) this.b).Y).f(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                return e5f.a;
            case 7:
                tu0.K((AppCompatTextView) obj2, 300, new tb((Object) (st3) obj, 24, (Object) (cu3) this.b));
                return e5f.a;
            case 8:
                b54 b54 = (b54) obj2;
                int i3 = DevMenuScreen.u0;
                jqe jqe = ((b54) obj).b;
                DevMenuScreen devMenuScreen = (DevMenuScreen) this.b;
                CharSequence b2 = jqe.b(devMenuScreen.getContext());
                String obj3 = b2 != null ? b2.toString() : null;
                String str2 = "";
                if (obj3 == null) {
                    obj3 = str2;
                }
                CharSequence b3 = b54.b.b(devMenuScreen.getContext());
                if (b3 != null) {
                    str = b3.toString();
                }
                if (str != null) {
                    str2 = str;
                }
                return Integer.valueOf(obj3.compareTo(str2));
            case 9:
                ((ki5) this.b).d.k((String) obj, obj2);
                return e5f.a;
            case 10:
                fg7 fg72 = fg7.o;
                ForgotPinCodeDialog forgotPinCodeDialog = (ForgotPinCodeDialog) this.b;
                od2.L(new zn5(tu0.g((mn5) obj, forgotPinCodeDialog.getViewLifecycleOwner().Q(), fg72), new hy5((Continuation) null, (m56) obj2), 5), forgotPinCodeDialog.getViewLifecycleScope());
                return e5f.a;
            case 11:
                View view = (View) obj;
                rce rce = (rce) obj2;
                a66 a66 = (a66) this.b;
                if (a66 != null) {
                    a66.invoke(view, rce);
                }
                return e5f.a;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                e29 e29 = (e29) obj;
                ie7 ie7 = (ie7) obj2;
                by8 by83 = ie7.a;
                TextPaint paint = by83.a().getPaint();
                k29 k29 = (k29) this.b;
                os0 d = k29.d();
                boolean d2 = by83.b.d();
                pq9 pq9 = qp4.u0;
                paint.setColor(pq9.b(((w6a) d).a).i().a().d(d2).d.e);
                ie7 ie72 = (ie7) k29.e().c(e29);
                if (!(ie72 == null || (by82 = ie72.a) == null)) {
                    by82.b(by83.a());
                }
                by8 by84 = ie7.b;
                if (by83 != by84) {
                    by84.a().getPaint().setColor(pq9.b(((w6a) k29.d()).a).i().a().d(by84.b.d()).d.e);
                    ie7 ie73 = (ie7) k29.e().c(e29);
                    if (!(ie73 == null || (by8 = ie73.b) == null)) {
                        by8.b(by84.a());
                    }
                }
                return e5f.a;
            case 13:
                String str3 = (String) obj;
                List<l38> list = (List) obj2;
                int i4 = OneMeApplication.s0;
                int size = list.size();
                long j = 0;
                for (l38 l38 : list) {
                    j += l38.o.toMillis(l38.c);
                }
                StringBuilder sb = new StringBuilder("Thread: ");
                sb.append(str3);
                sb.append(", tasksCount = ");
                sb.append(size);
                sb.append(", totalDuration = ");
                String k = zr6.k(sb, j, "\n");
                StringBuilder sb2 = (StringBuilder) this.b;
                sb2.append(k);
                x53.m0(x53.x0(list, new ky6(6)), sb2, 0, new ww9(4), 60);
                sb2.append("\n");
                return e5f.a;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                int intValue = ((Integer) obj).intValue();
                jx3 jx3 = (jx3) obj2;
                kx3 key = jx3.getKey();
                jx3 jx32 = ((iqc) this.b).X.get(key);
                if (key != c32.X) {
                    i = jx3 != jx32 ? Integer.MIN_VALUE : intValue + 1;
                } else {
                    x77 x77 = (x77) jx32;
                    x77 x772 = (x77) jx3;
                    while (true) {
                        if (x772 != null) {
                            if (x772 != x77 && (x772 instanceof ScopeCoroutine)) {
                                x772 = ((ScopeCoroutine) x772).getParent();
                            }
                        }
                    }
                    str = x772;
                    if (str == x77) {
                        if (x77 != null) {
                            intValue++;
                        }
                        i = intValue;
                    } else {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + str + ", expected child of " + x77 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                }
                return Integer.valueOf(i);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                long longValue = ((Long) obj).longValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                lfd lfd = ((wfd) this.b).F0;
                if (lfd != null) {
                    lfd.X(longValue, booleanValue2);
                }
                return e5f.a;
            case 16:
                ((lfd) this.b).X(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                return e5f.a;
            case LangUtils.HASH_SEED /*17*/:
                long longValue2 = ((Long) obj).longValue();
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                bc7[] bc7Arr = SettingMediaScreen.Y;
                ndd m0 = ((SettingMediaScreen) ((fd7) this.b).a).m0();
                int i5 = (int) longValue2;
                m0.getClass();
                if (i5 == fha.m) {
                    m0.x0.o1(m0, ndd.A0[6], pnf.n(m0, (lx3) null, (vx3) null, new gdd(m0, booleanValue3, (Continuation) null), 3));
                } else if (i5 == fha.j) {
                    m0.y0.o1(m0, ndd.A0[7], pnf.n(m0, (lx3) null, (vx3) null, new fdd(m0, booleanValue3, (Continuation) null), 3));
                } else if (i5 == fha.n) {
                    m0.w0.o1(m0, ndd.A0[5], pnf.n(m0, (lx3) null, (vx3) null, new kdd(m0, booleanValue3, (Continuation) null), 3));
                }
                return e5f.a;
            case 18:
                long longValue3 = ((Long) obj).longValue();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                bc7[] bc7Arr2 = SettingsPrivacyScreen.Z;
                cid m02 = ((SettingsPrivacyScreen) ((qqd) this.b).b).m0();
                m02.getClass();
                long j2 = jha.h;
                if (longValue3 == j2) {
                    if (!booleanValue4) {
                        m02.K0 = j2;
                        m02.x();
                    } else if (!m02.s().r()) {
                        if (m02.s().r()) {
                            wm9 = (!m02.s().r() || !m02.t().b()) ? xdd.b : ydd.b;
                        } else if (((t33) m02.t()).g.getBoolean("app.onboarding.safe_mode", false)) {
                            ihd.c.getClass();
                            wm9 = new c64(":settings/privacy/pincode?mode=setup");
                        } else {
                            ihd.c.getClass();
                            wm9 = new c64(":settings/privacy/onboarding");
                        }
                        m02.w(wm9);
                    }
                }
                return e5f.a;
            case 19:
                int intValue2 = ((Integer) obj).intValue();
                int intValue3 = ((Integer) obj2).intValue();
                bc7[] bc7Arr3 = StickersSettingsScreen.Y;
                w6e m03 = ((StickersSettingsScreen) this.b).m0();
                ArrayList arrayList = new ArrayList((Collection) m03.X.getValue());
                if (intValue3 >= 0 && intValue3 <= y53.L(arrayList)) {
                    y0d y0d = (y0d) arrayList.get(intValue3);
                    if (y0d instanceof w0d) {
                        m03.v0 = Long.valueOf(((w0d) y0d).a);
                        if (m03.t0 == null) {
                            m03.u0 = intValue2;
                            Object obj4 = arrayList.get(intValue2);
                            w0d w0d = obj4 instanceof w0d ? (w0d) obj4 : null;
                            m03.t0 = w0d != null ? Long.valueOf(w0d.a) : null;
                        }
                        Object obj5 = arrayList.get(intValue2);
                        arrayList.remove(intValue2);
                        arrayList.add(intValue3, obj5);
                        m03.X.m((Object) null, arrayList);
                    }
                }
                return e5f.a;
            case 20:
                List list2 = (List) obj;
                if (((Integer) obj2).intValue() == gja.v) {
                    eqe eqe = new eqe(list2.size() > 1 ? hja.t : hja.s);
                    int size2 = list2.size();
                    a8e a8e = (a8e) this.b;
                    String s = a8e.s(size2);
                    a5e a5e = a5e.RECENT;
                    a5e a5e2 = a8e.b;
                    Context context = a8e.o;
                    pnf.o(a8e.A0, new sed(eqe, new iqe(context.getString(hja.u, new Object[]{s, a5e2 == a5e ? context.getString(hja.E) : context.getString(hja.y)})), y53.M(new mg3(gja.c, new eqe(hja.h), 1, false), new mg3(gja.a, new eqe(hja.i), 2, false))));
                }
                return e5f.a;
            case 21:
                View view2 = (View) obj;
                if (((MotionEvent) obj2).getAction() == 0 && (re6 = y9f.F0) != null) {
                    ((FoldersListScreen) re6.b).o.t((y9f = (y9f) this.b));
                }
                return Boolean.FALSE;
            default:
                Long l = (Long) obj;
                l.longValue();
                ((gdf) this.b).d.invoke(l, (View) obj2);
                return e5f.a;
        }
    }
}
