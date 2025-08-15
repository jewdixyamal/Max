package one.me.appearancesettings.singletheme;

import android.annotation.SuppressLint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/appearancesettings/singletheme/AppearanceSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "appearance-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class AppearanceSettingsScreen extends Widget {
    public static final /* synthetic */ bc7[] Z;
    public final jv5 X;
    public final je7 Y;
    public final glc a = new glc(new m(11), (k56) null, 6);
    public final je7 b = createViewModelLazy(zr.class, new s(7, new m(12)));
    public final q7c c = viewBinding(n4a.d);
    public final je7 o;

    static {
        Class<AppearanceSettingsScreen> cls = AppearanceSettingsScreen.class;
        Z = new bc7[]{new hob(cls, "chatPreview", "getChatPreview()Lone/me/appearancesettings/singletheme/view/ChatAppearanceSelectorView;", 0), zr6.e(nec.a, cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public AppearanceSettingsScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        viewBinding(n4a.i);
        jq jqVar = jq.a;
        khe d = jqVar.getAccessor().d(iba.class);
        this.o = d;
        this.X = new jv5((Object) new mr(m0()), ((iba) d.getValue()).a(), 2);
        this.Y = jqVar.getAccessor().d(hp.class);
    }

    public final x27 getInsetsConfig() {
        x27 x27 = x27.c;
        return x27.d;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final zr m0() {
        return (zr) this.b.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        y52 y52 = new y52(getContext(), ((iba) this.o.getValue()).a());
        y52.setId(n4a.d);
        y52.setBackgroundSelectedListener(new or(m0()));
        j47.T(getViewLifecycleScope(), (lx3) null, (vx3) null, new pr(y52, this, (Continuation) null), 3);
        cla cla = new cla(getContext(), 6);
        cla.setId(n4a.k);
        cla.setForm(uka.a);
        cla.setTitle(o4a.m);
        cla.setLeftActions(new kka(new l(10, this)));
        TextView textView = new TextView(getContext());
        textView.setId(n4a.j);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        kqe kqe = i4f.u;
        kqe.b(textView, du4.b);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.j(textView).getText().g);
        textView.setText(z7.B(textView.getContext(), o4a.k));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(n4a.i);
        recyclerView.setLayoutParams(new ti3(-1, 0));
        recyclerView.setAdapter(this.X);
        recyclerView.setItemAnimator((mdc) null);
        recyclerView.j(new kq(0));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        TextView textView2 = new TextView(getContext());
        textView2.setId(n4a.g);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        kqe.b(textView2, du4.b);
        textView2.setTextColor(pq9.j(textView2).getText().g);
        textView2.setText(z7.B(textView2.getContext(), o4a.d));
        float[] fArr = new float[8];
        int i = 0;
        for (int i2 = 8; i < i2; i2 = 8) {
            fArr[i] = fk4.d().getDisplayMetrics().density * 16.0f;
            i++;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        ngg.G(shapeDrawable, pq9.b(getContext()).i().b().g);
        tha tha = new tha(getContext());
        tha.setId(n4a.h);
        tha.setLayoutParams(new ti3(0, 0));
        tha.setValueFrom(0.0f);
        tha.setValueTo(5.0f);
        tha.setStepSize(1.0f);
        tha.setValue((float) ((kxc) ((hp) this.Y.getValue())).e("app.extra.text.size.mode", 1));
        tha.setBackground(shapeDrawable);
        TextView textView3 = new TextView(getContext());
        textView3.setId(n4a.f);
        textView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        i4f.E.b(textView3, du4.b);
        textView3.setTextColor(pq9.j(textView3).getText().g);
        textView3.setText(z7.B(textView3.getContext(), o4a.c));
        tu0.K(textView3, 300, new oq(tha, textView3, 1));
        tha.B0.add(new qq(textView3, this, 1));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        float f = (float) 12;
        float f2 = (float) 16;
        ShapeDrawable shapeDrawable2 = shapeDrawable;
        constraintLayout.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        constraintLayout.setLayoutParams(layoutParams);
        jq jqVar = jq.a;
        od2.L(new zn5(od2.F(new ac((w7c) ((zaa) jqVar.getAccessor().c(zaa.class)).a, 2, this), ((w9a) ((kke) jqVar.getAccessor().d(kke.class).getValue())).a()), new qr(y52, (Continuation) null), 5), getViewLifecycleScope());
        constraintLayout.addView(y52);
        constraintLayout.addView(textView);
        constraintLayout.addView(recyclerView);
        constraintLayout.addView(textView2);
        constraintLayout.addView(textView3);
        constraintLayout.addView(tha);
        dj3 q = fp3.q(constraintLayout);
        int id = y52.getId();
        q.d(id, 3, 0, 3);
        q.d(id, 6, 0, 6);
        q.d(id, 7, 0, 7);
        int id2 = textView.getId();
        q.d(id2, 3, y52.getId(), 4);
        float f3 = (float) 24;
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id2, 4));
        q.d(id2, 6, 0, 6);
        new l2a(q, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        int id3 = recyclerView.getId();
        q.d(id3, 3, textView.getId(), 4);
        float f4 = (float) 6;
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id3, 4));
        q.d(id3, 6, 0, 6);
        q.d(id3, 7, 0, 7);
        int id4 = textView2.getId();
        q.d(id4, 3, recyclerView.getId(), 4);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id4, 4));
        q.d(id4, 6, 0, 6);
        new l2a(q, 6, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        int id5 = textView3.getId();
        q.d(id5, 3, recyclerView.getId(), 4);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id5, 4));
        q.d(id5, 7, 0, 7);
        new l2a(q, 7, id5, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        int id6 = tha.getId();
        q.d(id6, 3, textView2.getId(), 4);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id6, 4));
        q.d(id6, 6, 0, 6);
        q.d(id6, 7, 0, 7);
        q.a(constraintLayout);
        LinearLayout linearLayout = new LinearLayout(getContext());
        br7.e(linearLayout);
        linearLayout.setOrientation(1);
        linearLayout.addView(cla);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ScrollView scrollView = new ScrollView(linearLayout.getContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollView.addView(constraintLayout);
        linearLayout.addView(scrollView);
        v3c.y(new sq(this, textView, textView2, textView3, shapeDrawable2, y52, (Continuation) null), linearLayout);
        return linearLayout;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [a66, ffe] */
    public final void onViewCreated(View view) {
        i24.s(new zn5(m0().F0, new sr(this, (Continuation) null), 5), getViewLifecycleScope());
        i24.s(new zn5(m0().I0, new tr(this, (Continuation) null), 5), getViewLifecycleScope());
        i24.s(new zn5(m0().G0, new ffe(2, (Continuation) null), 5), getViewLifecycleScope());
        m0().x();
    }
}
