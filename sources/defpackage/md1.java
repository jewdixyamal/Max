package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.profile.screens.media.ChatMediaListWidget;
import one.me.sdk.richvector.internal.element.ClipPathElement;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: md1  reason: default package */
public final /* synthetic */ class md1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ md1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke() {
        int i;
        Set<g20> set;
        zh3 zh3;
        JSONArray optJSONArray;
        JSONObject jSONObject = null;
        boolean z = false;
        switch (this.a) {
            case 0:
                return nd1.a((nd1) this.b);
            case 1:
                bc7[] bc7Arr = CallRateBottomSheet.I0;
                bc7 bc7 = bc7Arr[0];
                CallRateBottomSheet callRateBottomSheet = (CallRateBottomSheet) this.b;
                bc7 bc72 = bc7Arr[1];
                boolean booleanValue = ((Boolean) callRateBottomSheet.z0.a(callRateBottomSheet)).booleanValue();
                bc7 bc73 = bc7Arr[2];
                return new lh1((String) callRateBottomSheet.y0.a(callRateBottomSheet), booleanValue, (List) callRateBottomSheet.A0.a(callRateBottomSheet));
            case 2:
                return Integer.valueOf(dm1.w((dm1) this.b));
            case 3:
                bc7[] bc7Arr2 = CallTopPanelWidget.o;
                return new sn1((el1) ((CallTopPanelWidget) this.b).a.getValue());
            case 4:
                return new b(24, (Object) (ip1) this.b);
            case 5:
                ivc ivc = (ivc) ((c11) this.b).b;
                return Integer.valueOf((ivc.f || ivc.e) ? 4 : 6);
            case 6:
                bc7[] bc7Arr3 = CallWaitingRoomEventsWidget.v0;
                return new lrf(((CallWaitingRoomEventsWidget) this.b).getContext());
            case 7:
                bc7[] bc7Arr4 = ChangeOwnerScreen.u0;
                long m0 = ((ChangeOwnerScreen) this.b).m0();
                xcb xcb = xcb.a;
                return new a32(m0, xcb.c(), xcb.e(), xcb.b(), xcb.f());
            case 8:
                return Boolean.valueOf(((se5) ((qe5) ((k52) this.b).g.getValue())).t());
            case 9:
                bc7[] bc7Arr5 = ChatMediaDownloadBottomSheet.E0;
                a10 a10 = new a10();
                a10.c = tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density);
                a10.b = true;
                a10.invalidateSelf();
                ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = (ChatMediaDownloadBottomSheet) this.b;
                fka q0 = chatMediaDownloadBottomSheet.q0();
                if (q0 == null) {
                    q0 = qp4.u0.b(chatMediaDownloadBottomSheet.getContext()).i();
                }
                a10.p.setColor(q0.getIcon().f);
                a10.invalidateSelf();
                a10.e = true;
                a10.invalidateSelf();
                return a10;
            case 10:
                bc7[] bc7Arr6 = ChatMediaListWidget.s0;
                ChatMediaListWidget chatMediaListWidget = (ChatMediaListWidget) this.b;
                af2 af2 = new af2(chatMediaListWidget.getContext());
                af2.setTitle(yea.r0);
                int ordinal = chatMediaListWidget.o0().ordinal();
                if (ordinal == 0) {
                    i = yfa.v;
                } else if (ordinal == 1) {
                    i = yfa.g;
                } else if (ordinal == 2) {
                    i = yfa.u;
                } else if (ordinal == 3) {
                    i = yfa.w;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                af2.setIcon(i);
                return af2;
            case 11:
                int ordinal2 = ((gi2) this.b).c.ordinal();
                if (ordinal2 == 0) {
                    set = bcd.a0(g20.c, g20.o);
                } else if (ordinal2 == 1) {
                    set = Collections.singleton(g20.u0);
                } else if (ordinal2 == 2) {
                    set = Collections.singleton(g20.Z);
                } else if (ordinal2 == 3) {
                    set = Collections.singleton(g20.X);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayList = new ArrayList(z53.S(set, 10));
                for (g20 obj : set) {
                    arrayList.add(obj.toString());
                }
                return x53.B0(arrayList);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                if (((kl2) this.b) == kl2.DEFAULT) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                return Integer.valueOf(qp4.u0.j((en2) this.b).getText().j);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                jr2 jr2 = (jr2) this.b;
                int i2 = ft4.o;
                qyc qyc = (qyc) jr2.b;
                qyc.getClass();
                int i3 = 60;
                int q = (int) qyc.q(PmsKey.f120subscriptiontimeoutseconds, (long) 60);
                if (q != 0) {
                    i3 = q;
                }
                long R = z7.R(i3, kt4.SECONDS);
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, "jr2", "#" + jr2.a + " timeout = " + ft4.j(R), (Throwable) null);
                }
                return new ft4(R);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                p82 l = ((jz2) this.b).l();
                l.e();
                Long l2 = (Long) l.e0("getMaxLastEventTime", new b82(l, 1));
                l2.longValue();
                return l2;
            case 16:
                bc7[] bc7Arr7 = ChatsTabWidget.C0;
                ((ChatsTabWidget) this.b).m0().requestDisallowInterceptTouchEvent(false);
                return e5f.a;
            case LangUtils.HASH_SEED /*17*/:
                bc7[] bc7Arr8 = ChatsTabWidget.C0;
                gy2.c.P1().b(":settings/folder/edit?id=".concat(((y5a) this.b).a), (Bundle) null);
                return e5f.a;
            case 18:
                return ClipPathElement.path_delegate$lambda$0((ClipPathElement) this.b);
            case 19:
                rme rme = rme.a;
                t63 t63 = (t63) this.b;
                kpa kpa = new kpa(rme, Integer.valueOf(t63.a));
                kpa kpa2 = new kpa(rme.b, Integer.valueOf(t63.b));
                kpa kpa3 = new kpa(rme.c, Integer.valueOf(t63.c));
                kpa kpa4 = new kpa(rme.o, Integer.valueOf(t63.e));
                kpa kpa5 = new kpa(rme.X, Integer.valueOf(t63.f));
                kpa kpa6 = new kpa(rme.Y, Integer.valueOf(t63.h));
                kpa kpa7 = new kpa(rme.Z, Integer.valueOf(t63.j));
                kpa kpa8 = new kpa(rme.s0, Integer.valueOf(t63.k));
                kpa kpa9 = new kpa(rme.t0, Integer.valueOf(t63.l));
                kpa kpa10 = new kpa(rme.u0, Integer.valueOf(t63.m));
                kpa kpa11 = new kpa(rme.v0, Integer.valueOf(t63.n));
                kpa kpa12 = new kpa(rme.w0, Integer.valueOf(t63.o));
                kpa kpa13 = new kpa(rme.x0, Integer.valueOf(t63.p));
                kpa kpa14 = new kpa(rme.y0, Integer.valueOf(t63.q));
                kpa kpa15 = new kpa(rme.z0, Integer.valueOf(t63.r));
                kpa kpa16 = new kpa(rme.A0, Integer.valueOf(t63.s));
                kpa kpa17 = new kpa(rme.B0, Integer.valueOf(t63.t));
                kpa kpa18 = new kpa(rme.C0, Integer.valueOf(t63.u));
                kpa kpa19 = new kpa(rme.D0, Integer.valueOf(t63.v));
                kpa kpa20 = new kpa(rme.E0, Integer.valueOf(t63.w));
                kpa kpa21 = new kpa(rme.F0, Integer.valueOf(t63.x));
                kpa kpa22 = new kpa(rme.G0, Integer.valueOf(t63.y));
                kpa kpa23 = new kpa(rme.H0, Integer.valueOf(t63.z));
                kpa kpa24 = new kpa(rme.I0, Integer.valueOf(t63.A));
                kpa kpa25 = new kpa(rme.J0, Integer.valueOf(t63.B));
                kpa kpa26 = new kpa(rme.K0, Integer.valueOf(t63.C));
                kpa kpa27 = new kpa(rme.L0, Integer.valueOf(t63.D));
                kpa kpa28 = new kpa(rme.M0, Integer.valueOf(t63.E));
                kpa kpa29 = new kpa(rme.N0, Integer.valueOf(t63.F));
                kpa kpa30 = new kpa(rme.O0, Integer.valueOf(t63.G));
                kpa kpa31 = new kpa(rme.P0, Integer.valueOf(t63.H));
                kpa kpa32 = new kpa(rme.Q0, Integer.valueOf(t63.I));
                kpa kpa33 = new kpa(rme.R0, Integer.valueOf(t63.J));
                kpa kpa34 = new kpa(rme.S0, Integer.valueOf(t63.K));
                kpa kpa35 = new kpa(rme.T0, t63.L);
                kpa kpa36 = new kpa(rme.U0, t63.M);
                kpa kpa37 = new kpa(rme.V0, t63.N);
                kpa kpa38 = new kpa(rme.W0, t63.O);
                kpa kpa39 = new kpa(rme.X0, t63.P);
                kpa kpa40 = new kpa(rme.Y0, Integer.valueOf(t63.Q));
                kpa kpa41 = new kpa(rme.Z0, Integer.valueOf(t63.R));
                kpa kpa42 = new kpa(rme.a1, Integer.valueOf(t63.S));
                kpa kpa43 = kpa14;
                kpa kpa44 = kpa15;
                return mz7.Y(kpa, kpa2, kpa3, kpa4, kpa5, kpa6, kpa7, kpa8, kpa9, kpa10, kpa11, kpa12, kpa13, kpa14, kpa15, kpa16, kpa17, kpa18, kpa19, kpa20, kpa21, kpa22, kpa23, kpa24, kpa25, kpa26, kpa27, kpa28, kpa29, kpa30, kpa31, kpa32, kpa33, kpa34, kpa35, kpa36, kpa37, kpa38, kpa39, kpa40, kpa41, kpa42);
            case 20:
                int i4 = ConfirmAddOpponentToCallBottomSheet.A0;
                return a14.m(((ConfirmAddOpponentToCallBottomSheet) this.b).getContext());
            case 21:
                int i5 = ConfirmRemoveOpponentToCallBottomSheet.B0;
                return ((ConfirmRemoveOpponentToCallBottomSheet) this.b).getViewLifecycleScope();
            case 22:
                return Integer.valueOf(Integer.parseInt(((eh3) this.b).b));
            case 23:
                ai3 ai3 = (ai3) this.b;
                qyc qyc2 = (qyc) ((y7d) ai3.a);
                qyc2.getClass();
                String string = qyc2.g.getString(PmsKey.f27conntimeouts.name(), (String) null);
                if (string != null) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                    }
                }
                khe khe = (khe) ai3.X;
                if (jSONObject == null) {
                    return (Map) khe.getValue();
                }
                EnumMap enumMap = new EnumMap((Map) khe.getValue());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Integer e0 = dae.e0(next);
                    if (!(e0 == null || (zh3 = (zh3) x53.j0(e0.intValue(), zh3.s0)) == null || (optJSONArray = jSONObject.optJSONArray(next)) == null || optJSONArray.length() == 0)) {
                        int length = optJSONArray.length();
                        long[] jArr = new long[length];
                        for (int i6 = 0; i6 < length; i6++) {
                            jArr[i6] = optJSONArray.optLong(i6, WorkRequest.MIN_BACKOFF_MILLIS);
                        }
                        enumMap.put(zh3, jArr);
                    }
                }
                return enumMap;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new RippleDrawable(ColorStateList.valueOf(qp4.u0.j((lk3) this.b).d().a.a.h), (Drawable) null, new ColorDrawable(-1));
            case 25:
                return j1e.a((nx3) ((yn3) this.b).m.getValue());
            case 26:
                return lp3.d((lp3) this.b);
            case 27:
                return Integer.valueOf(qp4.u0.j((eq3) this.b).getText().j);
            case 28:
                bc7[] bc7Arr9 = ContactsPickerScreen.v0;
                int i7 = vc7.a;
                if (vc7.b(vc7.c)) {
                    mr0.G((ContactsPickerScreen) this.b);
                }
                return e5f.a;
            default:
                ds3 ds3 = (ds3) this.b;
                el3 el3 = ds3.a;
                uj3 i8 = el3.i(((p7b) el3.h).a.t(), false);
                return i8 == null ? ds3.a(((Number) ds3.b.getValue()).longValue()) : i8;
        }
    }
}
