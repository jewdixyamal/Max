package one.me.appearancesettings.multitheme;

import android.animation.StateListAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
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
import com.google.android.material.button.MaterialButtonToggleGroup;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/appearancesettings/multitheme/AppearanceSettingsMultiThemeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "appearance-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class AppearanceSettingsMultiThemeScreen extends Widget {
    public static final /* synthetic */ bc7[] s0;
    public final q7c X = viewBinding(n4a.l);
    public final je7 Y;
    public final jv5 Z;
    public final glc a = new glc(new m(9), (k56) null, 6);
    public final je7 b = createViewModelLazy(kr.class, new s(6, new m(10)));
    public final q7c c = viewBinding(n4a.d);
    public final q7c o = viewBinding(n4a.e);

    static {
        Class<AppearanceSettingsMultiThemeScreen> cls = AppearanceSettingsMultiThemeScreen.class;
        hob hob = new hob(cls, "chatPreviewView", "getChatPreviewView()Lone/me/appearancesettings/multitheme/views/ChatPreviewView;", 0);
        oec oec = nec.a;
        s0 = new bc7[]{hob, zr6.e(oec, cls, "currentThemeTitle", "getCurrentThemeTitle()Landroid/widget/TextView;", 0), zr6.f(cls, "segmentedButtons", "getSegmentedButtons()Lcom/google/android/material/button/MaterialButtonToggleGroup;", 0, oec)};
    }

    public AppearanceSettingsMultiThemeScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        jq jqVar = jq.a;
        khe d = jqVar.getAccessor().d(iba.class);
        this.Y = jqVar.getAccessor().d(hp.class);
        this.Z = new jv5((Object) new cr(m0()), ((iba) d.getValue()).a(), 13);
    }

    public final x27 getInsetsConfig() {
        x27 x27 = x27.c;
        return x27.d;
    }

    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final kr m0() {
        return (kr) this.b.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cla cla = new cla(getContext(), 6);
        cla.setId(n4a.k);
        cla.setForm(uka.a);
        cla.setTitle(o4a.m);
        cla.setLeftActions(new kka(new nq(this, 0)));
        TextView textView = new TextView(getContext());
        textView.setId(n4a.g);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        i4f.u.b(textView, du4.b);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.j(textView).getText().g);
        textView.setText(z7.B(textView.getContext(), o4a.d));
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = fk4.d().getDisplayMetrics().density * 16.0f;
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
        TextView textView2 = new TextView(getContext());
        textView2.setId(n4a.f);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        i4f.E.b(textView2, du4.b);
        textView2.setTextColor(pq9.j(textView2).getText().g);
        textView2.setText(z7.B(textView2.getContext(), o4a.c));
        tu0.K(textView2, 300, new oq(tha, textView2, 0));
        tha.B0.add(new qq(textView2, this, 0));
        sm2 sm2 = new sm2(getContext());
        sm2.setId(n4a.d);
        j47.T(getViewLifecycleScope(), (lx3) null, (vx3) null, new tq(sm2, this, (Continuation) null), 3);
        TextView textView3 = new TextView(getContext());
        textView3.setId(n4a.e);
        textView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        i4f.j.b(textView3, du4.b);
        textView3.setTextColor(pq9.j(textView3).getText().e);
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(n4a.i);
        recyclerView.setLayoutParams(new ti3(-2, 0));
        recyclerView.setAdapter(this.Z);
        recyclerView.setItemAnimator((mdc) null);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.o1(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.j(new kq(11));
        recyclerView.j(new so9(recyclerView.getContext(), new nq(this, 1)));
        TextView textView4 = new TextView(getContext());
        textView4.setId(n4a.j);
        textView4.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        i4f.u.b(textView4, du4.b);
        textView4.setTextColor(pq9.j(textView4).getText().g);
        textView4.setText(z7.B(textView4.getContext(), o4a.k));
        MaterialButtonToggleGroup materialButtonToggleGroup = new MaterialButtonToggleGroup(getContext(), (AttributeSet) null);
        materialButtonToggleGroup.setId(n4a.l);
        materialButtonToggleGroup.setLayoutParams(new ti3(-1, 0));
        materialButtonToggleGroup.setElevation(0.0f);
        materialButtonToggleGroup.setStateListAnimator((StateListAnimator) null);
        materialButtonToggleGroup.setSingleSelection(true);
        materialButtonToggleGroup.setSelectionRequired(true);
        materialButtonToggleGroup.setOrientation(0);
        materialButtonToggleGroup.c.add(new pq(this));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        float f = (float) 12;
        float f2 = (float) 16;
        ShapeDrawable shapeDrawable2 = shapeDrawable;
        cla cla2 = cla;
        float f3 = f;
        constraintLayout.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        constraintLayout.setLayoutParams(layoutParams);
        jq jqVar = jq.a;
        od2.L(new zn5(od2.F(new ac((w7c) ((zaa) jqVar.getAccessor().c(zaa.class)).a, 1, this), ((w9a) ((kke) jqVar.getAccessor().d(kke.class).getValue())).a()), new uq(sm2, (Continuation) null), 5), getViewLifecycleScope());
        constraintLayout.addView(textView);
        constraintLayout.addView(textView2);
        constraintLayout.addView(tha);
        constraintLayout.addView(textView4);
        constraintLayout.addView(materialButtonToggleGroup);
        constraintLayout.addView(sm2);
        constraintLayout.addView(textView3);
        constraintLayout.addView(recyclerView);
        dj3 q = fp3.q(constraintLayout);
        int id = textView.getId();
        q.d(id, 3, 0, 3);
        q.d(id, 6, 0, 6);
        new l2a(q, 6, id, 4).e(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        int id2 = textView2.getId();
        q.d(id2, 3, 0, 3);
        q.d(id2, 7, 0, 7);
        new l2a(q, 7, id2, 4).e(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        int id3 = tha.getId();
        q.d(id3, 3, textView.getId(), 4);
        float f4 = (float) 6;
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id3, 4));
        q.d(id3, 6, 0, 6);
        q.d(id3, 7, 0, 7);
        int id4 = textView4.getId();
        q.d(id4, 3, tha.getId(), 4);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id4, 4));
        q.d(id4, 6, 0, 6);
        new l2a(q, 6, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        int id5 = materialButtonToggleGroup.getId();
        q.d(id5, 3, textView4.getId(), 4);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id5, 4));
        q.d(id5, 6, 0, 6);
        q.d(id5, 7, 0, 7);
        int id6 = sm2.getId();
        q.d(id6, 3, materialButtonToggleGroup.getId(), 4);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id6, 4));
        q.d(id6, 6, 0, 6);
        q.d(id6, 7, 0, 7);
        int id7 = textView3.getId();
        q.d(id7, 3, sm2.getId(), 4);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id7, 4));
        q.d(id7, 6, 0, 6);
        q.d(id7, 7, 0, 7);
        int id8 = recyclerView.getId();
        q.d(id8, 3, textView3.getId(), 4);
        new l2a(q, 3, id8, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        q.d(id8, 6, 0, 6);
        q.d(id8, 7, 0, 7);
        q.a(constraintLayout);
        Context context = getContext();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams2);
        br7.e(linearLayout);
        linearLayout.setOrientation(1);
        linearLayout.addView(cla2);
        ScrollView scrollView = new ScrollView(linearLayout.getContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollView.addView(constraintLayout);
        linearLayout.addView(scrollView);
        v3c.y(new sq(textView4, this, textView, textView2, shapeDrawable2, sm2, (Continuation) null), linearLayout);
        return linearLayout;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [a66, ffe] */
    public final void onViewCreated(View view) {
        mqc mqc = new mqc(new ar(new t03(m0().A0, 11), (Continuation) null, this));
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(mqc, getViewLifecycleOwner().Q(), fg7), new wq((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().C0, getViewLifecycleOwner().Q(), fg7), new ffe(2, (Continuation) null), 5), getViewLifecycleScope());
    }
}
