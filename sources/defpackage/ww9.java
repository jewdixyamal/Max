package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ww9  reason: default package */
public final /* synthetic */ class ww9 implements m56 {
    public final /* synthetic */ int a;

    public /* synthetic */ ww9() {
        this.a = 8;
        vmc vmc = vmc.a;
    }

    public final Object invoke(Object obj) {
        pq9 pq9 = qp4.u0;
        e5f e5f = e5f.a;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                bc7[] bc7Arr = NotificationsSettingsScreen.v0;
                sv9.c.P1().d();
                return e5f;
            case 1:
                Throwable th = (Throwable) obj;
                int i = OneMeApplication.s0;
                return Boolean.FALSE;
            case 2:
                l38 l38 = (l38) obj;
                int i2 = OneMeApplication.s0;
                return "    " + l38.a + ": executing=" + l38.o.toMillis(l38.c) + "ms";
            case 3:
                l38 l382 = (l38) obj;
                int i3 = OneMeApplication.s0;
                return "    " + l382.a + ": waiting=" + l382.o.toMillis(l382.b) + "ms";
            case 4:
                l38 l383 = (l38) obj;
                int i4 = OneMeApplication.s0;
                TimeUnit timeUnit = l383.o;
                return "    " + l383.a + ": executing=" + timeUnit.toMillis(l383.c) + "ms, waiting=" + timeUnit.toMillis(l383.b);
            case 5:
                int intValue = ((Integer) obj).intValue();
                return Integer.valueOf(intValue != 0 ? intValue != 1 ? 10 : 15 : 18);
            case 6:
                Long l = (Long) obj;
                return bj9.a();
            case 7:
                View view2 = (View) obj;
                ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                if (viewGroup == null) {
                    return null;
                }
                if (viewGroup.getChildCount() == 0) {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    return new at(7, viewGroup);
                }
                return null;
            case 8:
                View view3 = (View) obj;
                if (view3 instanceof ViewGroup) {
                    ((ViewGroup) view3).setOnHierarchyChangeListener(vmc.a);
                }
                return Boolean.TRUE;
            case 9:
                Collection collection = (Collection) obj;
                bc7[] bc7Arr2 = iba.p;
                return e5f;
            case 10:
                return Integer.valueOf(((fka) obj).getText().j);
            case 11:
                return Integer.valueOf(26 - ((((Integer) obj).intValue() + 1) * 4));
            case Protos.Attaches.Attach.PRESENT:
                return Integer.valueOf(((fka) obj).getText().j);
            case 13:
                return ((jl3) obj).a();
            case Protos.Attaches.Attach.LOCATION:
                View view4 = (View) obj;
                bc7[] bc7Arr3 = OtherNotificationsSettingsScreen.Y;
                sv9.c.P1().d();
                return e5f;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return ((nl2) obj).C0;
            case 16:
                y5a y5a = (y5a) obj;
                bc7[] bc7Arr4 = PickerChatsTabWidget.y0;
                return Boolean.FALSE;
            case LangUtils.HASH_SEED:
                ((Integer) obj).getClass();
                bc7[] bc7Arr5 = PickerContactsListWidget.y0;
                return Boolean.FALSE;
            case 18:
                Long l2 = (Long) obj;
                return r0e.a((Object) null);
            case 19:
                kpa kpa = (kpa) obj;
                return new uab(((Long) kpa.a).longValue(), Collections.singletonList((String) kpa.b));
            case 20:
                View view5 = (View) obj;
                bc7[] bc7Arr6 = ProfileInviteScreen.Y;
                ckb.c.f2();
                return e5f;
            case 21:
                return Integer.valueOf(((fka) obj).getText().g);
            case 22:
                fka fka = (fka) obj;
                bc7[] bc7Arr7 = ProfileScreen.D0;
                fka.getIcon();
                return new dcf(-1, fka.getIcon().k);
            case 23:
                Toolbar toolbar = (Toolbar) obj;
                bc7[] bc7Arr8 = ProfileScreen.D0;
                cla cla = new cla(toolbar.getContext(), 6);
                cla.setId(wea.k1);
                cla.setForm(uka.a);
                cla.setTextShimmerEnabled(false);
                cla.setLeftActions(new kka(new ww9(26)));
                float f = (float) 6;
                cla.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), cla.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), cla.getPaddingBottom());
                toolbar.addView(cla);
                return e5f;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                LinearLayout linearLayout = (LinearLayout) obj;
                bc7[] bc7Arr9 = ProfileScreen.D0;
                s5a s5a = new s5a(linearLayout.getContext());
                s5a.setId(wea.e1);
                float f2 = (float) 96;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 1;
                layoutParams.topMargin = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
                s5a.setLayoutParams(layoutParams);
                linearLayout.addView(s5a);
                TextView textView = new TextView(linearLayout.getContext());
                textView.setId(wea.i1);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                float f3 = (float) 20;
                layoutParams2.leftMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                layoutParams2.rightMargin = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
                layoutParams2.topMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                layoutParams2.gravity = 1;
                textView.setLayoutParams(layoutParams2);
                textView.setMaxLines(3);
                textView.setGravity(1);
                i4f.y.b(textView, du4.b);
                textView.setTextColor(pq9.j(textView).getText().e);
                linearLayout.addView(textView);
                ww9 ww9 = new ww9(25);
                LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                float f4 = (float) 12;
                linearLayout2.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density), linearLayout2.getPaddingBottom());
                linearLayout2.setOrientation(0);
                linearLayout2.setBackground((Drawable) null);
                linearLayout2.setGravity(1);
                ww9.invoke(linearLayout2);
                linearLayout.addView(linearLayout2);
                return e5f;
            case 25:
                LinearLayout linearLayout3 = (LinearLayout) obj;
                bc7[] bc7Arr10 = ProfileScreen.D0;
                AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout3.getContext(), (AttributeSet) null);
                appCompatTextView.setId(wea.U);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                float f5 = (float) 20;
                layoutParams3.leftMargin = tu0.G(fk4.d().getDisplayMetrics().density * f5);
                appCompatTextView.setLayoutParams(layoutParams3);
                appCompatTextView.setGravity(1);
                kqe kqe = i4f.n;
                kqe.b(appCompatTextView, du4.b);
                v3c.y(new mb5(3, (Continuation) null, 5), appCompatTextView);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView.setMaxLines(1);
                linearLayout3.addView(appCompatTextView);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout3.getContext(), (AttributeSet) null);
                appCompatTextView2.setId(wea.E);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                float f6 = (float) 4;
                layoutParams4.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f6));
                layoutParams4.setMarginEnd(tu0.G(f6 * fk4.d().getDisplayMetrics().density));
                appCompatTextView2.setLayoutParams(layoutParams4);
                appCompatTextView2.setText("·");
                appCompatTextView2.setGravity(1);
                kqe.b(appCompatTextView2, du4.b);
                v3c.y(new mb5(3, (Continuation) null, 4), appCompatTextView2);
                linearLayout3.addView(appCompatTextView2);
                TextView textView2 = new TextView(linearLayout3.getContext());
                textView2.setId(wea.h1);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.rightMargin = tu0.G(f5 * fk4.d().getDisplayMetrics().density);
                textView2.setLayoutParams(layoutParams5);
                textView2.setGravity(1);
                i4f.p.b(textView2, du4.b);
                textView2.setTextColor(pq9.j(textView2).getText().g);
                linearLayout3.addView(textView2);
                return e5f;
            case 26:
                View view6 = (View) obj;
                bc7[] bc7Arr11 = ProfileScreen.D0;
                ckb.c.f2();
                return e5f;
            case 27:
                fka fka2 = (fka) obj;
                bc7[] bc7Arr12 = ProfileScreen.D0;
                fka2.getIcon();
                return new dcf(-1, fka2.getIcon().k);
            case 28:
                return new b6c((Context) obj);
            default:
                return String.valueOf(obj);
        }
    }

    public /* synthetic */ ww9(int i) {
        this.a = i;
    }

    public /* synthetic */ ww9(ProfileScreen profileScreen, int i) {
        this.a = i;
    }
}
