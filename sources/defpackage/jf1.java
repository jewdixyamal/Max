package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: jf1  reason: default package */
public final class jf1 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ Object t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf1(Object obj, je7 je7, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.t0 = obj;
        this.Y = je7;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                jf1 jf1 = new jf1((Object) (je7) this.Y, (Object) (of1) this.t0, (Continuation) obj3, 0);
                jf1.Z = (Long) obj;
                jf1.s0 = (CharSequence) obj2;
                e5f e5f = e5f.a;
                jf1.o(e5f);
                return e5f;
            case 1:
                jf1 jf12 = new jf1((Object) (rq2) this.t0, (je7) this.Y, (Continuation) obj3, 1);
                jf12.Z = (e52) obj;
                jf12.s0 = (uj3) obj2;
                return jf12.o(e5f.a);
            case 2:
                jf1 jf13 = new jf1((Object) (ImageView) this.Y, (Object) (TextView) this.t0, (Continuation) obj3, 2);
                jf13.Z = (LinearLayout) obj;
                jf13.s0 = (fka) obj2;
                e5f e5f2 = e5f.a;
                jf13.o(e5f2);
                return e5f2;
            case 3:
                jf1 jf14 = new jf1((Object) (AppCompatImageView) this.Y, (Object) (TextView) this.t0, (Continuation) obj3, 3);
                jf14.Z = (FrameLayout) obj;
                jf14.s0 = (fka) obj2;
                e5f e5f3 = e5f.a;
                jf14.o(e5f3);
                return e5f3;
            case 4:
                jf1 jf15 = new jf1((Object) (xp8) this.Y, (Object) (String) this.t0, (Continuation) obj3, 4);
                jf15.Z = (List) obj;
                jf15.s0 = (List) obj2;
                return jf15.o(e5f.a);
            case 5:
                jf1 jf16 = new jf1((Object) (t1b) this.t0, (je7) this.Y, (Continuation) obj3, 5);
                jf16.Z = (fqa) obj;
                jf16.s0 = (d04) obj2;
                e5f e5f4 = e5f.a;
                jf16.o(e5f4);
                return e5f4;
            case 6:
                FrameLayout frameLayout = (FrameLayout) obj;
                jf1 jf17 = new jf1((Drawable) this.s0, (Drawable) this.Y, (GradientDrawable) this.t0, (Continuation) obj3, 6);
                jf17.Z = (fka) obj2;
                e5f e5f5 = e5f.a;
                jf17.o(e5f5);
                return e5f5;
            default:
                LinearLayout linearLayout = (LinearLayout) obj;
                jf1 jf18 = new jf1((TextView) this.s0, (TextView) this.Y, (Drawable) this.t0, (Continuation) obj3, 7);
                jf18.Z = (fka) obj2;
                e5f e5f6 = e5f.a;
                jf18.o(e5f6);
                return e5f6;
        }
    }

    public final Object o(Object obj) {
        Object value;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                CharSequence charSequence = (CharSequence) this.s0;
                ((bn1) ((je7) this.Y).getValue()).getClass();
                String e = bn1.e((Long) this.Z);
                if (e != null && !w9e.C0(e)) {
                    charSequence = charSequence + " · " + e;
                }
                cn1 cn1 = new cn1(1, "", charSequence);
                en1 en1 = ((of1) this.t0).B0;
                en1.b = cn1;
                for (dn1 x : en1.a) {
                    x.x(cn1);
                }
                return e5f.a;
            case 1:
                od2.a0(obj);
                e52 e52 = (e52) this.Z;
                uj3 uj3 = (uj3) this.s0;
                boolean s = uj3 != null ? uj3.s() : e52.G();
                boolean z = !((se5) ((qe5) ((rq2) this.t0).z0.getValue())).t() || !e52.y();
                if (e52.b.J.b(64)) {
                    return yq2.Y;
                }
                if (s) {
                    return yq2.a;
                }
                if (e52.T()) {
                    return yq2.b;
                }
                if (e52.L()) {
                    return yq2.c;
                }
                if (e52.S()) {
                    return yq2.o;
                }
                if (e52.W()) {
                    return yq2.X;
                }
                boolean I = e52.I();
                je7 je7 = (je7) this.Y;
                if (I && e52.c0() && !e52.x() && z && e52.V((q33) je7.getValue())) {
                    return yq2.Z;
                }
                if (e52.I() && e52.c0() && !e52.x() && z && !e52.V((q33) je7.getValue())) {
                    return yq2.s0;
                }
                if (!e52.I() || e52.c0()) {
                    return null;
                }
                return yq2.t0;
            case 2:
                od2.a0(obj);
                fka fka = (fka) this.s0;
                ((ImageView) this.Y).setColorFilter(fka.getIcon().k);
                ((TextView) this.t0).setTextColor(fka.getText().j);
                ((LinearLayout) this.Z).setBackground(new RippleDrawable(ColorStateList.valueOf(fka.d().a.a.h), (Drawable) null, new ColorDrawable(-65536)));
                return e5f.a;
            case 3:
                od2.a0(obj);
                FrameLayout frameLayout = (FrameLayout) this.Z;
                pq9 pq9 = qp4.u0;
                ((AppCompatImageView) this.Y).setImageTintList(ColorStateList.valueOf(pq9.j(frameLayout).getIcon().k));
                ((TextView) this.t0).setTextColor(pq9.j(frameLayout).getText().j);
                frameLayout.setForeground(new RippleDrawable(ColorStateList.valueOf(((fka) this.s0).d().a.a.h), (Drawable) null, bt5.F0));
                return e5f.a;
            case 4:
                od2.a0(obj);
                List list = (List) this.Z;
                List list2 = (List) this.s0;
                x53.t0(list, list2);
                xp8 xp8 = (xp8) this.Y;
                String str = (String) this.t0;
                return x53.t0(xp8.c(xp8, list, str), xp8.c(xp8, list2, str));
            case 5:
                od2.a0(obj);
                fqa fqa = (fqa) this.Z;
                d04 d04 = (d04) this.s0;
                q0e q0e = ((t1b) this.t0).o;
                do {
                    value = q0e.getValue();
                    qma qma = (qma) value;
                } while (!q0e.c(value, dz7.f(dz7.c(fqa, fqa.a.o(), d04.h, d04.f, (bn1) ((je7) this.Y).getValue(), d04.j, (gg1) null), false, d04.h, d04.f)));
                return e5f.a;
            case 6:
                od2.a0(obj);
                ((fka) this.Z).getIcon();
                ((Drawable) this.s0).setTint(-1);
                ((Drawable) this.Y).setTint(-1);
                ((GradientDrawable) this.t0).setTint(-1728053248);
                return e5f.a;
            default:
                od2.a0(obj);
                fka fka2 = (fka) this.Z;
                ((TextView) this.s0).setTextColor(fka2.getText().e);
                ((TextView) this.Y).setTextColor(fka2.getText().g);
                ((Drawable) this.t0).setTint(fka2.getIcon().h);
                return e5f.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf1(Object obj, Object obj2, Drawable drawable, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.s0 = obj;
        this.Y = obj2;
        this.t0 = drawable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf1(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Y = obj;
        this.t0 = obj2;
    }
}
