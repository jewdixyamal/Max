package defpackage;

import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import ru.ok.tamtam.nano.Protos;

/* renamed from: pf1  reason: default package */
public final /* synthetic */ class pf1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallOpponentsListWidget b;

    public /* synthetic */ pf1(CallOpponentsListWidget callOpponentsListWidget, int i) {
        this.a = i;
        this.b = callOpponentsListWidget;
    }

    public final Object invoke() {
        pq9 pq9 = qp4.u0;
        CallOpponentsListWidget callOpponentsListWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = CallOpponentsListWidget.H0;
                fm fmVar = new fm(callOpponentsListWidget.getContext());
                fmVar.setFocusable(true);
                fmVar.setFocusableInTouchMode(true);
                fmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                fmVar.setBackground((Drawable) null);
                fmVar.setStateListAnimator((StateListAnimator) null);
                return fmVar;
            case 1:
                bc7[] bc7Arr2 = CallOpponentsListWidget.H0;
                return tpa.u(callOpponentsListWidget.getContext());
            case 2:
                bc7[] bc7Arr3 = CallOpponentsListWidget.H0;
                Drawable b2 = kt3.b(callOpponentsListWidget.getContext(), ztb.ic_clear_16);
                b2.setTint(pq9.o(callOpponentsListWidget.getContext()).c.getText().g);
                return b2;
            case 3:
                bc7[] bc7Arr4 = CallOpponentsListWidget.H0;
                je7 c = yi1.c();
                je7 je7 = iyc.a;
                n31 n31 = n31.a;
                kke s = jyc.a.s();
                zi1 zi1 = zi1.a;
                ir1 b3 = zi1.b();
                je7 b4 = yi1.b();
                je7 a2 = yi1.a();
                je7 d = yi1.d();
                khe d2 = zi1.getAccessor().d(kr1.class);
                qx7 qx7 = new qx7(6);
                b31 b5 = n31.b();
                khe d3 = zi1.getAccessor().d(q33.class);
                ir1 b6 = zi1.b();
                je7 a3 = yi1.a();
                je7 je72 = iyc.b;
                return new of1(c, d2, b4, a2, d, d3, b5, new eo1(new pf1(callOpponentsListWidget, 9), b6, iyc.l, yi1.c(), je72, a3, iyc.a()), (oqa) n31.getAccessor().c(oqa.class), s, b3, qx7);
            case 4:
                bc7[] bc7Arr5 = CallOpponentsListWidget.H0;
                LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                t53 t53 = new t53(-1, -2);
                t53.a = 2;
                linearLayout.setLayoutParams(t53);
                linearLayout.setOrientation(1);
                return linearLayout;
            case 5:
                bc7[] bc7Arr6 = CallOpponentsListWidget.H0;
                return new pka((yka) null, new wka(x7a.C, 0, new qf1(callOpponentsListWidget, 1), 14));
            case 6:
                bc7[] bc7Arr7 = CallOpponentsListWidget.H0;
                cla cla = new cla(callOpponentsListWidget.getContext(), 6);
                cla.setForm(uka.a);
                cla.setTextShimmerEnabled(false);
                cla.setLeftActions(new kka(new qf1(callOpponentsListWidget, 0)));
                float f = (float) 6;
                cla.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), cla.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), cla.getPaddingBottom());
                cla.setCustomTheme(pq9.p(cla).c);
                return cla;
            case 7:
                bc7[] bc7Arr8 = CallOpponentsListWidget.H0;
                o7a o7a = new o7a(callOpponentsListWidget.getContext());
                o7a.setId(y7a.o0);
                rw3 rw3 = new rw3(-1, -2);
                float f2 = (float) 12;
                rw3.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f2));
                rw3.setMarginEnd(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                o7a.setLayoutParams(rw3);
                o7a.setCustomTheme(pq9.p(o7a).c);
                o7a.setAppearance(g7a.b);
                o7a.setListener(new ync(17, callOpponentsListWidget));
                return o7a;
            case 8:
                bc7[] bc7Arr9 = CallOpponentsListWidget.H0;
                RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), (AttributeSet) null);
                recyclerView.setId(rvb.call_user_list_in_call_list);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter((cf1) callOpponentsListWidget.D0.getValue());
                recyclerView.setClipToPadding(true);
                recyclerView.setBackgroundColor(pq9.p(recyclerView).c.b().k);
                rw3 rw32 = new rw3(-1, -1);
                rw32.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerView.setLayoutParams(rw32);
                return recyclerView;
            case 9:
                bc7[] bc7Arr10 = CallOpponentsListWidget.H0;
                return callOpponentsListWidget.getViewLifecycleScope();
            case 10:
                bc7[] bc7Arr11 = CallOpponentsListWidget.H0;
                TextView textView = new TextView(callOpponentsListWidget.getContext());
                i4f.B.b(textView, du4.b);
                textView.setTextColor(pq9.p(textView).c.getText().e);
                textView.setMaxLines(3);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(17);
                float f3 = (float) 20;
                textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                float f4 = (float) 28;
                layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f4));
                layoutParams.setMarginEnd(tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                textView.setLayoutParams(layoutParams);
                return textView;
            case 11:
                bc7[] bc7Arr12 = CallOpponentsListWidget.H0;
                TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                i4f.p.b(textView2, du4.b);
                textView2.setTextColor(pq9.p(textView2).c.getText().g);
                textView2.setMaxLines(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(17);
                float f5 = (float) 12;
                textView2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), tu0.G(f5 * fk4.d().getDisplayMetrics().density), tu0.G(((float) 18) * fk4.d().getDisplayMetrics().density));
                textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return textView2;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                bc7[] bc7Arr13 = CallOpponentsListWidget.H0;
                TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                i4f.u.b(textView3, du4.b);
                textView3.setTextColor(pq9.p(textView3).c.getText().g);
                textView3.setMaxLines(1);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                textView3.setText(b8a.p1);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                float f6 = (float) 12;
                layoutParams2.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f6));
                layoutParams2.setMarginEnd(tu0.G(f6 * fk4.d().getDisplayMetrics().density));
                layoutParams2.topMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                layoutParams2.bottomMargin = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
                textView3.setLayoutParams(layoutParams2);
                return textView3;
            case 13:
                bc7[] bc7Arr14 = CallOpponentsListWidget.H0;
                EditText editText = new EditText(callOpponentsListWidget.getContext());
                editText.setId(rvb.call_user_list_in_call_bottom_search);
                i4f.a.b(editText, du4.b);
                editText.setHintTextColor(pq9.p(editText).c.getText().g);
                editText.setTextColor(pq9.p(editText).c.getText().e);
                float f7 = (float) 12;
                int G = tu0.G(fk4.d().getDisplayMetrics().density * f7);
                editText.setPadding(G, G, G, G);
                editText.setMaxLines(1);
                editText.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                t53 t532 = new t53(-1, -2);
                t532.a = 1;
                t532.bottomMargin = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
                t532.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f7));
                t532.setMarginEnd(tu0.G(f7 * fk4.d().getDisplayMetrics().density));
                editText.setLayoutParams(t532);
                bn1 bn1 = (bn1) callOpponentsListWidget.b.getValue();
                int i = b8a.f2;
                bn1.getClass();
                Context context = bn1.a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wg0.i("  ", context.getString(i)));
                Drawable E = dy7.E(ztb.ic_search_outline_16, pq9.o(context).c.getIcon().j, context);
                float f8 = (float) 16;
                E.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f8), tu0.G(f8 * fk4.d().getDisplayMetrics().density));
                spannableStringBuilder.setSpan(new yl5(E, (sl5) null, 6), 0, 1, 17);
                editText.setHint(spannableStringBuilder);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), (RectF) null, (float[]) null));
                shapeDrawable.getPaint().setColor(pq9.p(editText).c.b().a.g);
                editText.setBackground(shapeDrawable);
                editText.addTextChangedListener(new vf1(editText, 0, callOpponentsListWidget));
                editText.setOnTouchListener(new rf1(new we1(3), 0, editText));
                return editText;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                bc7[] bc7Arr15 = CallOpponentsListWidget.H0;
                ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                viewStub.setId(rvb.call_screen_opponent_empty_list);
                return viewStub;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                bc7[] bc7Arr16 = CallOpponentsListWidget.H0;
                aba aba = new aba(callOpponentsListWidget.getContext(), (AttributeSet) null);
                aba.setId(rvb.call_screen_opponent_empty_list);
                rw3 rw33 = new rw3(-1, -1);
                rw33.b(new AppBarLayout$ScrollingViewBehavior());
                aba.setLayoutParams(rw33);
                aba.setPadding(0, 0, 0, rh4.c((float) 40, fk4.d().getDisplayMetrics().density, ((ivc) callOpponentsListWidget.c.getValue()).d));
                aba.setIcon(x7a.n0);
                aba.setTitle(new eqe(b8a.n1));
                aba.setSubtitle(new eqe(b8a.m1));
                aba.setVisibility(8);
                aba.setCustomTheme(pq9.p(aba).c);
                return aba;
            case 16:
                bc7[] bc7Arr17 = CallOpponentsListWidget.H0;
                return new cf1(new ey1(6, callOpponentsListWidget));
            default:
                bc7[] bc7Arr18 = CallOpponentsListWidget.H0;
                return new ja(new sy4(6, (Object) callOpponentsListWidget), ((iba) zi1.a.getAccessor().c(iba.class)).a(), new lrf(callOpponentsListWidget.getContext()));
        }
    }
}
