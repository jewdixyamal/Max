package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.mediarouter.app.e;
import androidx.mediarouter.app.f;
import androidx.mediarouter.app.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: ng8  reason: default package */
public final class ng8 extends hdc {
    public final LayoutInflater X;
    public final Drawable Y;
    public final Drawable Z;
    public final ArrayList o = new ArrayList();
    public final Drawable s0;
    public final Drawable t0;
    public mg8 u0;
    public final int v0;
    public final AccelerateDecelerateInterpolator w0;
    public final /* synthetic */ pg8 x0;

    public ng8(pg8 pg8) {
        this.x0 = pg8;
        this.X = LayoutInflater.from(pg8.y0);
        int i = qsb.mediaRouteDefaultIconDrawable;
        Context context = pg8.y0;
        this.Y = lh8.e(context, i);
        this.Z = lh8.e(context, qsb.mediaRouteTvIconDrawable);
        this.s0 = lh8.e(context, qsb.mediaRouteSpeakerIconDrawable);
        this.t0 = lh8.e(context, qsb.mediaRouteSpeakerGroupIconDrawable);
        this.v0 = context.getResources().getInteger(iyb.mr_cast_volume_slider_layout_animation_duration_ms);
        this.w0 = new AccelerateDecelerateInterpolator();
        F();
    }

    public final void C(View view, int i) {
        vf8 vf8 = new vf8(view, i, view.getLayoutParams().height, 1);
        vf8.setAnimationListener(new rf8(1, this));
        vf8.setDuration((long) this.v0);
        vf8.setInterpolator(this.w0);
        view.startAnimation(vf8);
    }

    public final Drawable D(dh8 dh8) {
        Uri uri = dh8.f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.x0.y0.getContentResolver().openInputStream(uri), (String) null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException unused) {
                uri.toString();
            }
        }
        int i = dh8.m;
        return i != 1 ? i != 2 ? dh8.e() ? this.t0 : this.Y : this.s0 : this.Z;
    }

    public final void E() {
        pg8 pg8 = this.x0;
        pg8.x0.clear();
        ArrayList arrayList = pg8.x0;
        ArrayList arrayList2 = pg8.v0;
        ArrayList arrayList3 = new ArrayList();
        ch8 ch8 = pg8.t0.a;
        ch8.getClass();
        eh8.b();
        for (dh8 dh8 : Collections.unmodifiableList(ch8.b)) {
            gaa b = pg8.t0.b(dh8);
            if (b != null && b.B()) {
                arrayList3.add(dh8);
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        m();
    }

    public final void F() {
        ArrayList arrayList = this.o;
        arrayList.clear();
        pg8 pg8 = this.x0;
        this.u0 = new mg8(1, pg8.t0);
        ArrayList arrayList2 = pg8.u0;
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new mg8(3, (dh8) it.next()));
            }
        } else {
            arrayList.add(new mg8(3, pg8.t0));
        }
        ArrayList arrayList3 = pg8.v0;
        boolean z = false;
        if (!arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                dh8 dh8 = (dh8) it2.next();
                if (!arrayList2.contains(dh8)) {
                    if (!z2) {
                        pg8.t0.getClass();
                        sg8 a = dh8.a();
                        String j = a != null ? a.j() : null;
                        if (TextUtils.isEmpty(j)) {
                            j = pg8.y0.getString(n1c.mr_dialog_groupable_header);
                        }
                        arrayList.add(new mg8(2, j));
                        z2 = true;
                    }
                    arrayList.add(new mg8(3, dh8));
                }
            }
        }
        ArrayList arrayList4 = pg8.w0;
        if (!arrayList4.isEmpty()) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                dh8 dh82 = (dh8) it3.next();
                dh8 dh83 = pg8.t0;
                if (dh83 != dh82) {
                    if (!z) {
                        dh83.getClass();
                        sg8 a2 = dh8.a();
                        String k = a2 != null ? a2.k() : null;
                        if (TextUtils.isEmpty(k)) {
                            k = pg8.y0.getString(n1c.mr_dialog_transferable_header);
                        }
                        arrayList.add(new mg8(2, k));
                        z = true;
                    }
                    arrayList.add(new mg8(4, dh82));
                }
            }
        }
        E();
    }

    public final int j() {
        return this.o.size() + 1;
    }

    public final int l(int i) {
        mg8 mg8;
        if (i == 0) {
            mg8 = this.u0;
        } else {
            mg8 = (mg8) this.o.get(i - 1);
        }
        return mg8.b;
    }

    public final void r(dec dec, int i) {
        gaa b;
        rg8 rg8;
        ArrayList arrayList = this.o;
        int i2 = (i == 0 ? this.u0 : (mg8) arrayList.get(i - 1)).b;
        boolean z = true;
        mg8 mg8 = i == 0 ? this.u0 : (mg8) arrayList.get(i - 1);
        pg8 pg8 = this.x0;
        int i3 = 0;
        if (i2 == 1) {
            pg8.G0.put(((dh8) mg8.a).c, (e) dec);
            f fVar = (f) dec;
            pg8 pg82 = fVar.L0.x0;
            if (pg82.d1 && Collections.unmodifiableList(pg82.t0.u).size() > 1) {
                i3 = fVar.K0;
            }
            View view = fVar.a;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
            dh8 dh8 = (dh8) mg8.a;
            fVar.A(dh8);
            fVar.J0.setText(dh8.d);
        } else if (i2 != 2) {
            float f = 1.0f;
            if (i2 == 3) {
                pg8.G0.put(((dh8) mg8.a).c, (e) dec);
                g gVar = (g) dec;
                dh8 dh82 = (dh8) mg8.a;
                ng8 ng8 = gVar.S0;
                pg8 pg83 = ng8.x0;
                if (dh82 == pg83.t0 && Collections.unmodifiableList(dh82.u).size() > 0) {
                    Iterator it = Collections.unmodifiableList(dh82.u).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        dh8 dh83 = (dh8) it.next();
                        if (!pg83.v0.contains(dh83)) {
                            dh82 = dh83;
                            break;
                        }
                    }
                }
                gVar.A(dh82);
                Drawable D = ng8.D(dh82);
                ImageView imageView = gVar.K0;
                imageView.setImageDrawable(D);
                gVar.M0.setText(dh82.d);
                CheckBox checkBox = gVar.O0;
                checkBox.setVisibility(0);
                boolean D2 = gVar.D(dh82);
                boolean z2 = !pg83.x0.contains(dh82) && (!gVar.D(dh82) || Collections.unmodifiableList(pg83.t0.u).size() >= 2) && (!gVar.D(dh82) || ((b = pg83.t0.b(dh82)) != null && ((rg8 = (rg8) b.a) == null || rg8.c)));
                checkBox.setChecked(D2);
                gVar.L0.setVisibility(4);
                imageView.setVisibility(0);
                View view2 = gVar.J0;
                view2.setEnabled(z2);
                checkBox.setEnabled(z2);
                gVar.G0.setEnabled(z2 || D2);
                if (!z2 && !D2) {
                    z = false;
                }
                gVar.H0.setEnabled(z);
                e0d e0d = gVar.R0;
                view2.setOnClickListener(e0d);
                checkBox.setOnClickListener(e0d);
                if (D2 && !gVar.F0.e()) {
                    i3 = gVar.Q0;
                }
                RelativeLayout relativeLayout = gVar.N0;
                ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
                layoutParams2.height = i3;
                relativeLayout.setLayoutParams(layoutParams2);
                float f2 = gVar.P0;
                view2.setAlpha((z2 || D2) ? 1.0f : f2);
                if (!z2 && D2) {
                    f = f2;
                }
                checkBox.setAlpha(f);
            } else if (i2 == 4) {
                kg8 kg8 = (kg8) dec;
                dh8 dh84 = (dh8) mg8.a;
                kg8.K0 = dh84;
                ImageView imageView2 = kg8.G0;
                imageView2.setVisibility(0);
                kg8.H0.setVisibility(4);
                ng8 ng82 = kg8.L0;
                List unmodifiableList = Collections.unmodifiableList(ng82.x0.t0.u);
                if (unmodifiableList.size() == 1 && unmodifiableList.get(0) == dh84) {
                    f = kg8.J0;
                }
                View view3 = kg8.F0;
                view3.setAlpha(f);
                view3.setOnClickListener(new e0d(8, kg8));
                imageView2.setImageDrawable(ng82.D(dh84));
                kg8.I0.setText(dh84.d);
            }
        } else {
            ((lg8) dec).F0.setText(mg8.a.toString());
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.X;
        if (i == 1) {
            return new f(this, layoutInflater.inflate(syb.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i == 2) {
            return new lg8(layoutInflater.inflate(syb.mr_cast_header_item, viewGroup, false));
        }
        if (i == 3) {
            return new g(this, layoutInflater.inflate(syb.mr_cast_route_item, viewGroup, false));
        }
        if (i != 4) {
            return null;
        }
        return new kg8(this, layoutInflater.inflate(syb.mr_cast_group_item, viewGroup, false));
    }

    public final void y(dec dec) {
        this.x0.G0.values().remove(dec);
    }
}
