package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: xh0  reason: default package */
public final class xh0 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh0(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) obj;
                xh0 xh0 = new xh0((Object) (BaseBottomSheetWidget) this.Z, (Continuation) obj3, 0);
                xh0.Y = (fka) obj2;
                e5f e5f = e5f.a;
                xh0.o(e5f);
                return e5f;
            case 1:
                xh0 xh02 = new xh0(3, (Continuation) obj3, 1);
                xh02.Y = (Long) obj;
                xh02.Z = (d04) obj2;
                return xh02.o(e5f.a);
            case 2:
                LinearLayout linearLayout = (LinearLayout) obj;
                xh0 xh03 = new xh0((Object) (pl2) this.Z, (Continuation) obj3, 2);
                xh03.Y = (fka) obj2;
                e5f e5f2 = e5f.a;
                xh03.o(e5f2);
                return e5f2;
            case 3:
                xh0 xh04 = new xh0(3, (Continuation) obj3, 3);
                xh04.Y = (ls2) obj;
                xh04.Z = (tzc) obj2;
                return xh04.o(e5f.a);
            case 4:
                xh0 xh05 = new xh0(3, (Continuation) obj3, 4);
                xh05.Z = (xh4) obj;
                xh05.Y = (fka) obj2;
                e5f e5f3 = e5f.a;
                xh05.o(e5f3);
                return e5f3;
            case 5:
                on5 on5 = (on5) obj;
                xh0 xh06 = new xh0((Object) (gw2) this.Z, (Continuation) obj3, 5);
                xh06.Y = (Throwable) obj2;
                e5f e5f4 = e5f.a;
                xh06.o(e5f4);
                return e5f4;
            case 6:
                xh0 xh07 = new xh0(3, (Continuation) obj3, 6);
                xh07.Y = (mt2) obj;
                xh07.Z = (List) obj2;
                return xh07.o(e5f.a);
            case 7:
                fka fka = (fka) obj2;
                xh0 xh08 = new xh0((Object) (tt3) this.Z, (Continuation) obj3, 7);
                xh08.Y = (TextView) obj;
                e5f e5f5 = e5f.a;
                xh08.o(e5f5);
                return e5f5;
            case 8:
                xh0 xh09 = new xh0(3, (Continuation) obj3, 8);
                xh09.Z = (n04) obj;
                xh09.Y = (fka) obj2;
                e5f e5f6 = e5f.a;
                xh09.o(e5f6);
                return e5f6;
            case 9:
                xh0 xh010 = new xh0(3, (Continuation) obj3, 9);
                xh010.Y = (meb) obj;
                xh010.Z = (List) obj2;
                return xh010.o(e5f.a);
            case 10:
                ViewGroup viewGroup = (ViewGroup) obj;
                fka fka2 = (fka) obj2;
                xh0 xh011 = new xh0((ky4) this.Y, (Context) this.Z, (Continuation) obj3, 10);
                e5f e5f7 = e5f.a;
                xh011.o(e5f7);
                return e5f7;
            case 11:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                xh0 xh012 = new xh0((Object) (rl5) this.Z, (Continuation) obj3, 11);
                xh012.Y = (fka) obj2;
                e5f e5f8 = e5f.a;
                xh012.o(e5f8);
                return e5f8;
            case Protos.Attaches.Attach.PRESENT:
                ViewGroup viewGroup2 = (ViewGroup) obj;
                xh0 xh013 = new xh0((Object) (tt5) this.Z, (Continuation) obj3, 12);
                xh013.Y = (fka) obj2;
                e5f e5f9 = e5f.a;
                xh013.o(e5f9);
                return e5f9;
            case 13:
                xh0 xh014 = new xh0(3, (Continuation) obj3, 13);
                xh014.Z = (ConstraintLayout) obj;
                xh014.Y = (fka) obj2;
                e5f e5f10 = e5f.a;
                xh014.o(e5f10);
                return e5f10;
            case Protos.Attaches.Attach.LOCATION:
                xh0 xh015 = new xh0(3, (Continuation) obj3, 14);
                xh015.Z = (csb) obj;
                xh015.Y = (fka) obj2;
                e5f e5f11 = e5f.a;
                xh015.o(e5f11);
                return e5f11;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                LinearLayout linearLayout3 = (LinearLayout) obj;
                xh0 xh016 = new xh0((Object) (InviteByQrBottomSheet) this.Z, (Continuation) obj3, 15);
                xh016.Y = (fka) obj2;
                e5f e5f12 = e5f.a;
                xh016.o(e5f12);
                return e5f12;
            case 16:
                LinearLayout linearLayout4 = (LinearLayout) obj;
                xh0 xh017 = new xh0((Object) (ae7) this.Z, (Continuation) obj3, 16);
                xh017.Y = (fka) obj2;
                e5f e5f13 = e5f.a;
                xh017.o(e5f13);
                return e5f13;
            case LangUtils.HASH_SEED:
                xh0 xh018 = new xh0(3, (Continuation) obj3, 17);
                xh018.Z = (vf7) obj;
                xh018.Y = (fka) obj2;
                e5f e5f14 = e5f.a;
                xh018.o(e5f14);
                return e5f14;
            case 18:
                xh0 xh019 = new xh0(3, (Continuation) obj3, 18);
                xh019.Y = (Long) obj;
                xh019.Z = (String) obj2;
                return xh019.o(e5f.a);
            case 19:
                View view = (View) obj;
                fka fka3 = (fka) obj2;
                xh0 xh020 = new xh0((qy8) this.Y, (View) this.Z, (Continuation) obj3, 19);
                e5f e5f15 = e5f.a;
                xh020.o(e5f15);
                return e5f15;
            case 20:
                xh0 xh021 = new xh0(3, (Continuation) obj3, 20);
                xh021.Y = (e52) obj;
                xh021.Z = (l29) obj2;
                return xh021.o(e5f.a);
            case 21:
                fka fka4 = (fka) obj2;
                xh0 xh022 = new xh0((Object) (MessagesListWidget) this.Z, (Continuation) obj3, 21);
                xh022.Y = (EndlessRecyclerView2) obj;
                e5f e5f16 = e5f.a;
                xh022.o(e5f16);
                return e5f16;
            case 22:
                xh0 xh023 = new xh0(3, (Continuation) obj3, 22);
                xh023.Z = (cmd) obj;
                xh023.Y = (fka) obj2;
                e5f e5f17 = e5f.a;
                xh023.o(e5f17);
                return e5f17;
            case 23:
                xh0 xh024 = new xh0(3, (Continuation) obj3, 23);
                xh024.Y = (j4d) obj;
                xh024.Z = (l2b) obj2;
                return xh024.o(e5f.a);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                fka fka5 = (fka) obj2;
                xh0 xh025 = new xh0((Object) (Context) this.Z, (Continuation) obj3, 24);
                xh025.Y = (aba) obj;
                e5f e5f18 = e5f.a;
                xh025.o(e5f18);
                return e5f18;
            case 25:
                xh0 xh026 = new xh0(3, (Continuation) obj3, 25);
                xh026.Z = (pha) obj;
                xh026.Y = (fka) obj2;
                e5f e5f19 = e5f.a;
                xh026.o(e5f19);
                return e5f19;
            case 26:
                xh0 xh027 = new xh0(3, (Continuation) obj3, 26);
                xh027.Z = (eb9) obj;
                xh027.Y = (fka) obj2;
                e5f e5f20 = e5f.a;
                xh027.o(e5f20);
                return e5f20;
            case 27:
                xh0 xh028 = new xh0(3, (Continuation) obj3, 27);
                xh028.Z = (pea) obj;
                xh028.Y = (fka) obj2;
                e5f e5f21 = e5f.a;
                xh028.o(e5f21);
                return e5f21;
            case 28:
                xh0 xh029 = new xh0(3, (Continuation) obj3, 28);
                xh029.Z = (k5f) obj;
                xh029.Y = (fka) obj2;
                e5f e5f22 = e5f.a;
                xh029.o(e5f22);
                return e5f22;
            default:
                LinearLayout linearLayout5 = (LinearLayout) obj;
                xh0 xh030 = new xh0((Object) (ShapeDrawable) this.Z, (Continuation) obj3, 29);
                xh030.Y = (fka) obj2;
                e5f e5f23 = e5f.a;
                xh030.o(e5f23);
                return e5f23;
        }
    }

    public final Object o(Object obj) {
        int i;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                fka fka = (fka) this.Y;
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) this.Z;
                fka q0 = baseBottomSheetWidget.q0();
                if (q0 != null) {
                    fka = q0;
                }
                baseBottomSheetWidget.p0().setBackground(new ColorDrawable(fka.b().g));
                return e5f.a;
            case 1:
                od2.a0(obj);
                Long l = (Long) this.Y;
                if (((d04) this.Z).j instanceof g95) {
                    return null;
                }
                return l;
            case 2:
                od2.a0(obj);
                fka fka2 = (fka) this.Y;
                pl2 pl2 = (pl2) this.Z;
                pl2.F0.onThemeChanged(fka2);
                je7 je7 = pl2.G0;
                if (je7.a()) {
                    ((TextView) je7.getValue()).setTextColor(fka2.getText().b);
                }
                return e5f.a;
            case 3:
                od2.a0(obj);
                return new kpa((ls2) this.Y, (tzc) this.Z);
            case 4:
                od2.a0(obj);
                ((xh4) this.Z).onThemeChanged((fka) this.Y);
                return e5f.a;
            case 5:
                od2.a0(obj);
                Throwable th = (Throwable) this.Y;
                if (!(th instanceof CancellationException)) {
                    hm9.p(((gw2) this.Z).J0, "observeChatsAndPresences fail", th);
                }
                return e5f.a;
            case 6:
                od2.a0(obj);
                return new kpa((mt2) this.Y, (List) this.Z);
            case 7:
                od2.a0(obj);
                TextView textView = (TextView) this.Y;
                Integer num = ((tt3) this.Z).c;
                pq9 pq9 = qp4.u0;
                if (num != null) {
                    i = pq9.j(textView).c(num.intValue());
                } else {
                    i = pq9.j(textView).getText().e;
                }
                textView.setTextColor(i);
                return e5f.a;
            case 8:
                od2.a0(obj);
                n04 n04 = (n04) this.Z;
                fka fka3 = (fka) this.Y;
                n04.b.setTextColor(fka3.getText().e);
                EditText editText = n04.b;
                editText.setHintTextColor(fka3.getText().i);
                editText.setBackground((Drawable) null);
                n04.c.setTextColor(fka3.getText().g);
                n04.setBackgroundColor(fka3.b().a.h);
                return e5f.a;
            case 9:
                od2.a0(obj);
                return new fv4((meb) this.Y, (List) this.Z);
            case 10:
                od2.a0(obj);
                ky4 ky4 = (ky4) this.Y;
                ngg.G(ky4.F0, qp4.u0.b((Context) this.Z).i().b().a.g);
                d02 d02 = ky4.J0;
                if (d02 != null) {
                    ky4.E(d02.c);
                }
                return e5f.a;
            case 11:
                od2.a0(obj);
                fka fka4 = (fka) this.Y;
                rl5 rl5 = (rl5) this.Z;
                AppCompatEditText appCompatEditText = rl5.F0;
                appCompatEditText.setTextColor(fka4.getText().e);
                appCompatEditText.setHintTextColor(fka4.getText().i);
                appCompatEditText.setBackgroundColor(fka4.b().g);
                je7 je72 = rl5.G0;
                if (je72.a()) {
                    ((AppCompatTextView) je72.getValue()).setTextColor(fka4.getText().b);
                }
                return e5f.a;
            case Protos.Attaches.Attach.PRESENT:
                od2.a0(obj);
                ((tt5) this.Z).F0.onThemeChanged((fka) this.Y);
                return e5f.a;
            case 13:
                od2.a0(obj);
                ((ConstraintLayout) this.Z).setBackgroundColor(((fka) this.Y).b().k);
                return e5f.a;
            case Protos.Attaches.Attach.LOCATION:
                od2.a0(obj);
                csb csb = (csb) this.Z;
                csb.setBackgroundColor(qp4.u0.j(csb).a().h().a.d);
                csb.onThemeChanged((fka) this.Y);
                return e5f.a;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                od2.a0(obj);
                fka fka5 = (fka) this.Y;
                InviteByQrBottomSheet inviteByQrBottomSheet = (InviteByQrBottomSheet) this.Z;
                InviteByQrBottomSheet.A0(inviteByQrBottomSheet).setTextColor(fka5.getText().e);
                InviteByQrBottomSheet.B0(inviteByQrBottomSheet).setTextColor(fka5.getText().g);
                return e5f.a;
            case 16:
                od2.a0(obj);
                fka fka6 = (fka) this.Y;
                ae7 ae7 = (ae7) this.Z;
                AppCompatEditText appCompatEditText2 = ae7.F0;
                appCompatEditText2.setTextColor(fka6.getText().e);
                appCompatEditText2.setHintTextColor(fka6.getText().i);
                appCompatEditText2.setBackgroundColor(fka6.b().g);
                je7 je73 = ae7.G0;
                if (je73.a()) {
                    ((AppCompatTextView) je73.getValue()).setTextColor(fka6.getText().b);
                }
                return e5f.a;
            case LangUtils.HASH_SEED:
                od2.a0(obj);
                ((vf7) this.Z).c.setImageTintList(ColorStateList.valueOf(((fka) this.Y).getText().e));
                return e5f.a;
            case 18:
                od2.a0(obj);
                Long l2 = (Long) this.Y;
                String str = (String) this.Z;
                if (l2 != null && l2.longValue() == -1) {
                    str = null;
                }
                if (str != null) {
                    return Uri.parse(str);
                }
                return null;
            case 19:
                od2.a0(obj);
                qy8 qy8 = (qy8) this.Y;
                ry8 ry8 = qy8.H0;
                if (ry8 != null) {
                    boolean b = ns0.b(ry8.a & 2080374784);
                    nr2 a = qp4.u0.j((View) this.Z).a();
                    qy8.a(a.d(b));
                    qy8.e(a.s());
                }
                return e5f.a;
            case 20:
                od2.a0(obj);
                return new kpa((e52) this.Y, (l29) this.Z);
            case 21:
                od2.a0(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.Y;
                h8e h8e = ((MessagesListWidget) this.Z).H0;
                if (h8e != null) {
                    h8e.j();
                }
                endlessRecyclerView2.Y();
                return e5f.a;
            case 22:
                od2.a0(obj);
                fka fka7 = (fka) this.Y;
                bkg bkg = new bkg(25);
                yld yld = (yld) bkg.b;
                yld.k = false;
                yld.i = 0.0f;
                bkg.v(fka7.b().l);
                yld.d = fka7.b().k;
                bkg.u();
                bkg.x(tu0.G(((float) 86) * fk4.d().getDisplayMetrics().density));
                ((cmd) this.Z).a(bkg.m());
                return e5f.a;
            case 23:
                od2.a0(obj);
                return new k4d((j4d) this.Y, (l2b) this.Z);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                od2.a0(obj);
                aba aba = (aba) this.Y;
                qp4 b2 = qp4.u0.b((Context) this.Z);
                fka w = aba.getCurrentTheme();
                b2.getClass();
                qp4.c(aba, w);
                return e5f.a;
            case 25:
                od2.a0(obj);
                ((fka) this.Y).g().a.b.getClass();
                ((pha) this.Z).t0 = 687865856;
                return e5f.a;
            case 26:
                od2.a0(obj);
                ((eb9) this.Z).setBackground(new RippleDrawable(ColorStateList.valueOf(((fka) this.Y).d().a.a.d), (Drawable) null, new ColorDrawable(-65536)));
                return e5f.a;
            case 27:
                od2.a0(obj);
                ((pea) this.Z).setBackground(new RippleDrawable(ColorStateList.valueOf(((fka) this.Y).d().a.a.d), (Drawable) null, new ColorDrawable(-65536)));
                return e5f.a;
            case 28:
                od2.a0(obj);
                ((k5f) this.Z).setBackground(new RippleDrawable(ColorStateList.valueOf(((fka) this.Y).d().a.a.d), (Drawable) null, new ColorDrawable(-65536)));
                return e5f.a;
            default:
                od2.a0(obj);
                ((ShapeDrawable) this.Z).getPaint().setColor(((fka) this.Y).i().b.b);
                return e5f.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh0(hqd hqd, Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Y = hqd;
        this.Z = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh0(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = obj;
    }
}
