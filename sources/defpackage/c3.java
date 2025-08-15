package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.profile.ProfileScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: c3  reason: default package */
public final class c3 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ Object s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = obj;
        this.s0 = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                c3 c3Var = new c3((AbstractPickerScreen) this.s0, (Continuation) obj3, 0);
                c3Var.Y = (Map) obj;
                c3Var.Z = (Map) obj2;
                return c3Var.o(e5f.a);
            case 1:
                c3 c3Var2 = new c3((bc) this.s0, (Continuation) obj3, 1);
                c3Var2.Y = (List) obj;
                c3Var2.Z = (List) obj2;
                return c3Var2.o(e5f.a);
            case 2:
                c3 c3Var3 = new c3((BaseBottomSheetWidget) this.s0, (Continuation) obj3, 2);
                c3Var3.Y = (f6b) obj;
                c3Var3.Z = (fka) obj2;
                e5f e5f = e5f.a;
                c3Var3.o(e5f);
                return e5f;
            case 3:
                c3 c3Var4 = new c3((CallLinkInfoScreen) this.s0, (Continuation) obj3, 3);
                c3Var4.Y = (CoordinatorLayout) obj;
                c3Var4.Z = (fka) obj2;
                e5f e5f2 = e5f.a;
                c3Var4.o(e5f2);
                return e5f2;
            case 4:
                c3 c3Var5 = new c3((CallScreen) this.s0, (Continuation) obj3, 4);
                c3Var5.Y = (nnf) obj;
                c3Var5.Z = (List) obj2;
                e5f e5f3 = e5f.a;
                c3Var5.o(e5f3);
                return e5f3;
            case 5:
                c3 c3Var6 = new c3((el1) this.s0, (Continuation) obj3, 5);
                c3Var6.Y = (to1) obj;
                c3Var6.Z = (la1) obj2;
                return c3Var6.o(e5f.a);
            case 6:
                c3 c3Var7 = new c3((ChatScreen) this.s0, (Continuation) obj3, 6);
                c3Var7.Y = (tzc) obj;
                c3Var7.Z = (yq2) obj2;
                return c3Var7.o(e5f.a);
            case 7:
                c3 c3Var8 = new c3((nx2) this.s0, (Continuation) obj3, 7);
                c3Var8.Y = (mt2) obj;
                c3Var8.Z = (g4f) obj2;
                return c3Var8.o(e5f.a);
            case 8:
                fka fka = (fka) obj2;
                c3 c3Var9 = new c3((h8e) this.Z, (h8e) this.s0, (Continuation) obj3, 8);
                c3Var9.Y = (RecyclerView) obj;
                e5f e5f4 = e5f.a;
                c3Var9.o(e5f4);
                return e5f4;
            case 9:
                c3 c3Var10 = new c3((ContactListWidget) this.s0, (Continuation) obj3, 9);
                c3Var10.Y = (dn3) obj;
                c3Var10.Z = (List) obj2;
                e5f e5f5 = e5f.a;
                c3Var10.o(e5f5);
                return e5f5;
            case 10:
                fka fka2 = (fka) obj2;
                c3 c3Var11 = new c3((tt3) this.Z, (ImageView) this.s0, (Continuation) obj3, 10);
                c3Var11.Y = (FrameLayout) obj;
                e5f e5f6 = e5f.a;
                c3Var11.o(e5f6);
                return e5f6;
            case 11:
                c3 c3Var12 = new c3((ExternalCallbackWidget) this.s0, (Continuation) obj3, 11);
                c3Var12.Y = (TextView) obj;
                c3Var12.Z = (fka) obj2;
                e5f e5f7 = e5f.a;
                c3Var12.o(e5f7);
                return e5f7;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                c3 c3Var13 = new c3((jx5) this.s0, (Continuation) obj3, 12);
                c3Var13.Y = (List) obj;
                c3Var13.Z = (yv5) obj2;
                return c3Var13.o(e5f.a);
            case 13:
                c3 c3Var14 = new c3((InputPhoneScreen) this.s0, (Continuation) obj3, 13);
                c3Var14.Y = (TextView) obj;
                c3Var14.Z = (fka) obj2;
                e5f e5f8 = e5f.a;
                c3Var14.o(e5f8);
                return e5f8;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                c3 c3Var15 = new c3((Drawable) this.s0, (Continuation) obj3, 14);
                c3Var15.Y = (TextView) obj;
                c3Var15.Z = (fka) obj2;
                e5f e5f9 = e5f.a;
                c3Var15.o(e5f9);
                return e5f9;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                List list = (List) obj;
                c3 c3Var16 = new c3((EndlessRecyclerView2) this.Z, (LogsViewerScreen) this.s0, (Continuation) obj3, 15);
                c3Var16.Y = (List) obj2;
                e5f e5f10 = e5f.a;
                c3Var16.o(e5f10);
                return e5f10;
            case 16:
                LinearLayout linearLayout = (LinearLayout) obj;
                c3 c3Var17 = new c3((Drawable) this.Z, (AppCompatTextView) this.s0, (Continuation) obj3, 16);
                c3Var17.Y = (fka) obj2;
                e5f e5f11 = e5f.a;
                c3Var17.o(e5f11);
                return e5f11;
            case LangUtils.HASH_SEED /*17*/:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                c3 c3Var18 = new c3((AppCompatTextView) this.Z, (AppCompatTextView) this.s0, (Continuation) obj3, 17);
                c3Var18.Y = (fka) obj2;
                e5f e5f12 = e5f.a;
                c3Var18.o(e5f12);
                return e5f12;
            case 18:
                c3 c3Var19 = new c3((MessageContextMenuBottomSheet) this.s0, (Continuation) obj3, 18);
                c3Var19.Y = (FrameLayout) obj;
                c3Var19.Z = (fka) obj2;
                e5f e5f13 = e5f.a;
                c3Var19.o(e5f13);
                return e5f13;
            case 19:
                c3 c3Var20 = new c3((n59) this.s0, (Continuation) obj3, 19);
                c3Var20.Y = (e52) obj;
                c3Var20.Z = (l29) obj2;
                return c3Var20.o(e5f.a);
            case 20:
                c3 c3Var21 = new c3((aua) this.s0, (Continuation) obj3, 20);
                c3Var21.Y = (bua) obj;
                c3Var21.Z = (bua) obj2;
                e5f e5f14 = e5f.a;
                c3Var21.o(e5f14);
                return e5f14;
            case 21:
                c3 c3Var22 = new c3((eya) this.s0, (Continuation) obj3, 21);
                c3Var22.Y = (mt2) obj;
                c3Var22.Z = (List) obj2;
                return c3Var22.o(e5f.a);
            case 22:
                c3 c3Var23 = new c3((mya) this.s0, (Continuation) obj3, 22);
                c3Var23.Y = (List) obj;
                c3Var23.Z = (yv5) obj2;
                return c3Var23.o(e5f.a);
            case 23:
                c3 c3Var24 = new c3((PickerContactsListWidget) this.s0, (Continuation) obj3, 23);
                c3Var24.Y = (List) obj;
                c3Var24.Z = (List) obj2;
                e5f e5f15 = e5f.a;
                c3Var24.o(e5f15);
                return e5f15;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                c3 c3Var25 = new c3((ProfileChangeLinkScreen) this.s0, (Continuation) obj3, 24);
                c3Var25.Y = (ViewGroup) obj;
                c3Var25.Z = (fka) obj2;
                e5f e5f16 = e5f.a;
                c3Var25.o(e5f16);
                return e5f16;
            case 25:
                c3 c3Var26 = new c3((feb) this.s0, (Continuation) obj3, 25);
                c3Var26.Y = (e52) obj;
                c3Var26.Z = (uj3) obj2;
                return c3Var26.o(e5f.a);
            case 26:
                c3 c3Var27 = new c3((ProfileScreen) this.s0, (Continuation) obj3, 26);
                c3Var27.Y = (View) obj;
                c3Var27.Z = (fka) obj2;
                e5f e5f17 = e5f.a;
                c3Var27.o(e5f17);
                return e5f17;
            case 27:
                c3 c3Var28 = new c3((kcc) this.s0, (Continuation) obj3, 27);
                c3Var28.Y = (yj1) obj;
                c3Var28.Z = (Long) obj2;
                return c3Var28.o(e5f.a);
            case 28:
                c3 c3Var29 = new c3((kcc) this.s0, (Continuation) obj3, 28);
                c3Var29.Y = (pqa) obj;
                c3Var29.Z = (wvc) obj2;
                return c3Var29.o(e5f.a);
            default:
                c3 c3Var30 = new c3((s0d) this.s0, (Continuation) obj3, 29);
                c3Var30.Y = (TextView) obj;
                c3Var30.Z = (fka) obj2;
                e5f e5f18 = e5f.a;
                c3Var30.o(e5f18);
                return e5f18;
        }
    }

    /* JADX WARNING: type inference failed for: r3v16, types: [jec, java.lang.Object] */
    public final Object o(Object obj) {
        int i;
        Object[] objArr;
        int i2;
        g4f g4f;
        List list;
        boolean z;
        FeatureRoles featureRoles = null;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                Map map = (Map) this.Y;
                Map map2 = (Map) this.Z;
                Iterator it = bcd.Y(map2.keySet(), map.keySet()).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    AbstractPickerScreen abstractPickerScreen = (AbstractPickerScreen) this.s0;
                    if (hasNext) {
                        long longValue = ((Number) it.next()).longValue();
                        g9a r0 = abstractPickerScreen.r0();
                        if (r0 != null) {
                            r0.c(longValue);
                        }
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map2.entrySet()) {
                            if (!tpa.f(map.get(entry.getKey()), entry.getValue())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            long longValue2 = ((Number) entry2.getKey()).longValue();
                            rya rya = (rya) entry2.getValue();
                            g9a r02 = abstractPickerScreen.r0();
                            if (r02 != null) {
                                r02.c(longValue2);
                            }
                            g9a r03 = abstractPickerScreen.r0();
                            if (r03 != null) {
                                r03.a(longValue2, rya.b, rya.e, rya.c, rya.d);
                            }
                        }
                        return map2;
                    }
                }
            case 1:
                od2.a0(obj);
                return ((bc) this.s0).q() ? (List) this.Z : (List) this.Y;
            case 2:
                od2.a0(obj);
                f6b f6b = (f6b) this.Y;
                fka fka = (fka) this.Z;
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) this.s0;
                fka q0 = baseBottomSheetWidget.q0();
                if (q0 != null) {
                    fka = q0;
                }
                bc7 bc7 = BaseBottomSheetWidget.Y[0];
                if (((Boolean) baseBottomSheetWidget.b.a(baseBottomSheetWidget)).booleanValue()) {
                    f6b.setBackground(new ColorDrawable(fka.b().e));
                }
                return e5f.a;
            case 3:
                od2.a0(obj);
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.Y;
                fka fka2 = (fka) this.Z;
                b46 b46 = CallLinkInfoScreen.B0;
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) this.s0;
                callLinkInfoScreen.getClass();
                bc7[] bc7Arr = CallLinkInfoScreen.C0;
                bc7 bc72 = bc7Arr[3];
                pq9 pq9 = qp4.u0;
                ((TextView) callLinkInfoScreen.u0.T0(callLinkInfoScreen, bc72)).setTextColor(pq9.j(coordinatorLayout).getText().e);
                TextView textView = (TextView) callLinkInfoScreen.v0.T0(callLinkInfoScreen, bc7Arr[4]);
                CharSequence text = textView.getText();
                Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                if (spanned != null) {
                    i = 0;
                    objArr = spanned.getSpans(0, textView.getText().length(), kre.class);
                } else {
                    i = 0;
                    objArr = null;
                }
                if (objArr == null) {
                    objArr = new kre[i];
                }
                for (Object obj2 : objArr) {
                    ((kre) obj2).onThemeChanged(pq9.j(coordinatorLayout));
                }
                coordinatorLayout.setBackgroundColor(fka2.b().j);
                return e5f.a;
            case 4:
                od2.a0(obj);
                List list2 = (List) this.Z;
                int i3 = mnf.$EnumSwitchMapping$0[((nnf) this.Y).ordinal()];
                if (i3 == 1 || i3 == 2) {
                    i2 = 0;
                } else if (i3 == 3) {
                    i2 = 1;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                CallScreen callScreen = (CallScreen) this.s0;
                if (i2 < 0 || i2 >= list2.size()) {
                    yxc yxc = CallScreen.R0;
                    i2 = Math.min(callScreen.E0().getCurrentItem(), list2.size() - 1);
                }
                ? obj3 = new Object();
                yxc yxc2 = CallScreen.R0;
                ((wd1) callScreen.H0.getValue()).F(list2, new si1((Object) obj3, (Object) callScreen, i2, 0));
                obj3.a = CallScreen.m0(callScreen, i2, "main");
                return e5f.a;
            case 5:
                od2.a0(obj);
                to1 to1 = (to1) this.Y;
                la1 la1 = (la1) this.Z;
                se5 se5 = (se5) ((qe5) ((el1) this.s0).u0.getValue());
                se5.getClass();
                boolean n = se5.n(PmsKey.f116showvpnsnackbar, false);
                u9f u9f = u9f.o;
                return (n && (la1.e instanceof f95)) ? to1.g : u9f;
            case 6:
                od2.a0(obj);
                yq2 yq2 = (yq2) this.Z;
                bc7[] bc7Arr2 = ChatScreen.k1;
                Long u = ((ChatScreen) this.s0).F0().u();
                return !(((tzc) this.Y) instanceof qzc) ? lr0.b : (yq2 == null || !(u == null || u.longValue() == 0)) ? lr0.a : lr0.c;
            case 7:
                CharSequence charSequence = null;
                od2.a0(obj);
                mt2 mt2 = (mt2) this.Y;
                g4f g4f2 = (g4f) this.Z;
                bc7[] bc7Arr3 = nx2.X0;
                ((nx2) this.s0).getClass();
                List<nl2> list3 = mt2.a;
                ArrayList arrayList = new ArrayList(z53.S(list3, 10));
                for (nl2 nl2 : list3) {
                    ns2 ns2 = (ns2) g4f2.a.c(nl2.a);
                    if (!tpa.f(ns2 != null ? ns2.b : charSequence, nl2.Z)) {
                        g4f = g4f2;
                        nl2 = new nl2(nl2.a, nl2.b, nl2.c, nl2.o, nl2.X, nl2.Y, ns2 != null ? ns2.b : charSequence, nl2.s0, nl2.t0, nl2.u0, nl2.v0, nl2.w0, nl2.x0, nl2.y0, nl2.z0, nl2.A0, nl2.B0, nl2.C0, nl2.D0, nl2.E0, nl2.F0, nl2.G0);
                    } else {
                        g4f = g4f2;
                    }
                    arrayList.add(nl2);
                    g4f2 = g4f;
                    charSequence = null;
                }
                return new mt2(arrayList, mt2.b);
            case 8:
                od2.a0(obj);
                ((h8e) this.Z).j();
                ((h8e) this.s0).j();
                ((RecyclerView) this.Y).Y();
                return e5f.a;
            case 9:
                od2.a0(obj);
                dn3 dn3 = (dn3) this.Y;
                List list4 = (List) this.Z;
                bc7[] bc7Arr4 = ContactListWidget.P0;
                ContactListWidget contactListWidget = (ContactListWidget) this.s0;
                CharSequence n0 = contactListWidget.n0();
                boolean z2 = !(n0 == null || n0.length() == 0);
                e5f e5f = e5f.a;
                if (!z2) {
                    contactListWidget.Y.E(dn3.a);
                    nz4 nz4 = nz4.a;
                    contactListWidget.Z.E(nz4);
                    contactListWidget.s0.E(dn3.c);
                    dn3 dn32 = dn3.d;
                    a3g a3g = contactListWidget.u0;
                    if (dn3 == dn32) {
                        a3g.E(nz4);
                    } else {
                        a3g.E(list4);
                    }
                }
                return e5f;
            case 10:
                od2.a0(obj);
                FrameLayout frameLayout = (FrameLayout) this.Y;
                Integer num = ((tt3) this.Z).e;
                if (num != null) {
                    ((ImageView) this.s0).setImageTintList(ColorStateList.valueOf(qp4.u0.j(frameLayout).c(num.intValue())));
                }
                return e5f.a;
            case 11:
                od2.a0(obj);
                fka fka3 = (fka) this.Z;
                int i4 = ExternalCallbackWidget.B0;
                ExternalCallbackWidget externalCallbackWidget = (ExternalCallbackWidget) this.s0;
                externalCallbackWidget.getClass();
                ((TextView) this.Y).setTextColor(fka3.getText().i);
                ((sz6) externalCallbackWidget.z0.getValue()).b = new int[]{0, fka3.getIcon().h};
                return e5f.a;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                od2.a0(obj);
                List<at5> list5 = (List) this.Y;
                yv5 yv5 = (yv5) this.Z;
                ArrayList arrayList2 = new ArrayList(z53.S(list5, 10));
                for (at5 at5 : list5) {
                    hy3 hy3 = (hy3) yv5.a.get(at5.a);
                    if (hy3 == null) {
                        hy3 = hy3.b;
                    }
                    ((jx5) this.s0).getClass();
                    arrayList2.add(new av5(at5.a, at5.b, at5.c, hy3, at5.C0));
                }
                return arrayList2;
            case 13:
                od2.a0(obj);
                fka fka4 = (fka) this.Z;
                ((TextView) this.Y).setTextColor(fka4.getText().g);
                bc7[] bc7Arr5 = InputPhoneScreen.E0;
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.s0;
                inputPhoneScreen.getClass();
                bc7 bc73 = InputPhoneScreen.E0[5];
                String B = z7.B(inputPhoneScreen.getContext(), v0c.oneme_login_welcome_terms);
                String B2 = z7.B(inputPhoneScreen.getContext(), v0c.oneme_login_welcome_privacy_policy_clickable_part);
                String B3 = z7.B(inputPhoneScreen.getContext(), v0c.oneme_login_welcome_user_agreement_clickable_part);
                SpannableString spannableString = new SpannableString(B);
                InputPhoneScreen.r0(B, B2, spannableString, new e27(0, inputPhoneScreen), fka4);
                InputPhoneScreen.r0(B, B3, spannableString, new e27(1, inputPhoneScreen), fka4);
                ((TextView) inputPhoneScreen.w0.T0(inputPhoneScreen, bc73)).setText(spannableString);
                return e5f.a;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                od2.a0(obj);
                TextView textView2 = (TextView) this.Y;
                fka fka5 = (fka) this.Z;
                ((Drawable) this.s0).setTint(fka5.getIcon().f);
                textView2.setTextColor(fka5.getText().j);
                textView2.setBackground(new RippleDrawable(ColorStateList.valueOf(fka5.d().a.a.d), new ColorDrawable(fka5.b().g), new ColorDrawable(-65536)));
                return e5f.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                od2.a0(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.Z;
                endlessRecyclerView2.setRefreshingNext(false);
                boolean isEmpty = ((List) this.Y).isEmpty();
                LogsViewerScreen logsViewerScreen = (LogsViewerScreen) this.s0;
                if (isEmpty) {
                    if (!tpa.f(endlessRecyclerView2.getAdapter(), logsViewerScreen.o)) {
                        endlessRecyclerView2.M0(logsViewerScreen.o, true);
                    }
                } else if (!tpa.f(endlessRecyclerView2.getAdapter(), logsViewerScreen.X)) {
                    endlessRecyclerView2.M0(logsViewerScreen.X, true);
                }
                logsViewerScreen.X.m();
                logsViewerScreen.o.m();
                return e5f.a;
            case 16:
                od2.a0(obj);
                ((fka) this.Y).getIcon();
                ((Drawable) this.Z).setTint(-1);
                ((AppCompatTextView) this.s0).setTextColor(-1);
                return e5f.a;
            case LangUtils.HASH_SEED /*17*/:
                od2.a0(obj);
                fka fka6 = (fka) this.Y;
                ((AppCompatTextView) this.Z).setTextColor(fka6.getText().e);
                ((AppCompatTextView) this.s0).setTextColor(fka6.getText().g);
                return e5f.a;
            case 18:
                od2.a0(obj);
                bc7[] bc7Arr6 = MessageContextMenuBottomSheet.Z0;
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) this.s0;
                messageContextMenuBottomSheet.getClass();
                ColorDrawable colorDrawable = messageContextMenuBottomSheet.L0;
                colorDrawable.setColor(((fka) this.Z).b().g);
                ((FrameLayout) this.Y).setBackground(colorDrawable);
                return e5f.a;
            case 19:
                od2.a0(obj);
                e52 e52 = (e52) this.Y;
                l29 l29 = (l29) this.Z;
                adb adb = ((n59) this.s0).h1;
                adb.getClass();
                kl7 l = j1e.l();
                if (!l29.c) {
                    Iterator it2 = ((ArrayList) adb.a).iterator();
                    while (it2.hasNext()) {
                        l.addAll(((r29) it2.next()).a(e52));
                    }
                }
                Iterator it3 = ((ArrayList) adb.b).iterator();
                if (!it3.hasNext()) {
                    l.addAll(l29.a);
                    if (!l29.b) {
                        Iterator it4 = ((ArrayList) adb.c).iterator();
                        if (it4.hasNext()) {
                            au1.r(it4.next());
                            throw null;
                        }
                    }
                    return j1e.d(l);
                }
                au1.r(it3.next());
                throw null;
            case 20:
                od2.a0(obj);
                bua bua = (bua) this.Y;
                bua bua2 = (bua) this.Z;
                bua bua3 = bua.a;
                aua.a((aua) this.s0, "gallery", bua == bua3 ? "allowed" : bua2 == bua3 ? "partial" : "denied");
                return e5f.a;
            case 21:
                od2.a0(obj);
                mt2 mt22 = (mt2) this.Y;
                List list6 = (List) this.Z;
                ((eya) this.s0).y0.m((Object) null, Boolean.valueOf(mt22.b));
                ArrayList arrayList3 = new ArrayList(mt22.a.size());
                if (!((Boolean) ((eya) this.s0).Y.invoke()).booleanValue() || mt22.b) {
                    List<nl2> list7 = mt22.a;
                    eya eya = (eya) this.s0;
                    for (nl2 q : list7) {
                        arrayList3.add(eya.q(eya, q));
                    }
                } else {
                    gi9 a = vv7.a();
                    pk5 pk5 = new pk5(l6d.e0(new at(2, mt22.a), new ww9(15)));
                    while (pk5.hasNext()) {
                        a.a(((Number) pk5.next()).longValue());
                    }
                    gi9 gi9 = ((eya) this.s0).E0;
                    long[] jArr = gi9.b;
                    long[] jArr2 = gi9.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr2[i5];
                            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                int i7 = 0;
                                while (i7 < i6) {
                                    if ((j & 255) < 128) {
                                        list = list6;
                                        if (!a.d(jArr[(i5 << 3) + i7])) {
                                            z = true;
                                        }
                                    } else {
                                        list = list6;
                                    }
                                    j >>= 8;
                                    i7++;
                                    list6 = list;
                                }
                                list = list6;
                                if (i6 != 8) {
                                }
                            } else {
                                list = list6;
                            }
                            if (i5 != length) {
                                i5++;
                                list6 = list;
                            }
                        }
                    } else {
                        list = list6;
                    }
                    z = false;
                    ((eya) this.s0).E0 = a;
                    if (!z) {
                        Iterable iterable = (Iterable) ((eya) this.s0).D0.getValue();
                        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                            Iterator it5 = iterable.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    if (a.d(((pxa) it5.next()).a)) {
                                    }
                                }
                            }
                        }
                    } else {
                        q0e q0e = ((eya) this.s0).C0;
                        q0e.m((Object) null, Long.valueOf(((Number) q0e.getValue()).longValue() + 1));
                    }
                    List<nl2> list8 = mt22.a;
                    eya eya2 = (eya) this.s0;
                    for (nl2 q2 : list8) {
                        arrayList3.add(eya.q(eya2, q2));
                    }
                    x53.t0(arrayList3, list);
                }
                return arrayList3;
            case 22:
                od2.a0(obj);
                List<at5> list9 = (List) this.Y;
                yv5 yv52 = (yv5) this.Z;
                ArrayList arrayList4 = new ArrayList(z53.S(list9, 10));
                for (at5 at52 : list9) {
                    hy3 hy32 = (hy3) yv52.a.get(at52.a);
                    if (hy32 == null) {
                        hy32 = hy3.b;
                    }
                    ((mya) this.s0).getClass();
                    arrayList4.add(new av5(at52.a, at52.b, at52.c, hy32, at52.C0));
                }
                return arrayList4;
            case 23:
                od2.a0(obj);
                PickerContactsListWidget pickerContactsListWidget = (PickerContactsListWidget) this.s0;
                pickerContactsListWidget.Z.E((List) this.Z);
                pickerContactsListWidget.X.E((List) this.Y);
                return e5f.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                od2.a0(obj);
                fka fka7 = (fka) this.Z;
                ((ViewGroup) this.Y).setBackgroundColor(fka7.b().j);
                bc7[] bc7Arr7 = ProfileChangeLinkScreen.v0;
                ((ProfileChangeLinkScreen) this.s0).o0().setBackgroundColor(fka7.b().j);
                return e5f.a;
            case 25:
                od2.a0(obj);
                e52 e522 = (e52) this.Y;
                uj3 uj3 = (uj3) this.Z;
                bc7[] bc7Arr8 = feb.G0;
                ((feb) this.s0).getClass();
                boolean z3 = uj3.n() == e522.b.d;
                return new pdb(z3 || oag.s(e522.e(uj3.n()), 4), z3 || oag.s(e522.e(uj3.n()), 1), z3 || oag.s(e522.e(uj3.n()), 16), z3 || oag.s(e522.e(uj3.n()), 8), z3 || oag.s(e522.e(uj3.n()), 2), z3 || oag.s(e522.e(uj3.n()), 128), (odb) null, (odb) null, (odb) null, (odb) null, (odb) null, (odb) null, (odb) null, 8128);
            case 26:
                od2.a0(obj);
                fka fka8 = (fka) this.Z;
                ((View) this.Y).setBackgroundColor(fka8.b().j);
                bc7[] bc7Arr9 = ProfileScreen.D0;
                ProfileScreen profileScreen = (ProfileScreen) this.s0;
                profileScreen.o0().setTextColor(fka8.getText().e);
                ((TextView) profileScreen.v0.T0(profileScreen, ProfileScreen.D0[6])).setTextColor(fka8.getText().g);
                return e5f.a;
            case 27:
                od2.a0(obj);
                yj1 yj1 = (yj1) this.Y;
                bn1 bn1 = (bn1) ((kcc) this.s0).X.getValue();
                bn1.getClass();
                String e = bn1.e((Long) this.Z);
                if (!yj1.c) {
                    return null;
                }
                if (yj1.a) {
                    return e;
                }
                return bn1.a.getString(b8a.N1, new Object[]{yj1.f, e});
            case 28:
                od2.a0(obj);
                wvc wvc = (wvc) this.Z;
                fqa fqa = ((pqa) this.Y).a;
                ConversationFeatureManager g = ((yz0) ((ez0) ((kcc) this.s0).Z.getValue())).g();
                if (g != null) {
                    featureRoles = g.getFeatureRoles(u61.b);
                }
                return dz7.d(wvc, fqa, !(featureRoles instanceof FeatureRoles.EnabledForAll));
            default:
                od2.a0(obj);
                ((TextView) this.Y).setTextColor(((Number) ((s0d) this.s0).b.invoke((fka) this.Z)).intValue());
                return e5f.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.s0 = obj;
    }
}
