package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: y52  reason: default package */
public final class y52 extends LinearLayout implements kre {
    public final rm2 a;
    public final AppCompatTextView b;
    public x52 c;
    public final jv5 o;

    public y52(Context context, ExecutorService executorService) {
        super(context, (AttributeSet) null);
        rm2 rm2 = new rm2(context);
        this.a = rm2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setText(z7.B(appCompatTextView.getContext(), o4a.a));
        i4f.j.b(appCompatTextView, du4.b);
        pq9 pq9 = qp4.u0;
        appCompatTextView.setTextColor(pq9.j(appCompatTextView).getText().e);
        this.b = appCompatTextView;
        jv5 jv5 = new jv5((Object) new w52(this), executorService, 3);
        this.o = jv5;
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setAdapter(jv5);
        recyclerView.setItemAnimator((mdc) null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.o1(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.j(new kq(2));
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rm2.setClipToOutline(true);
        rm2.setOutlineProvider(new xq0(1, fk4.d().getDisplayMetrics().density * 16.0f));
        float f = (float) 16;
        setBackground(hm9.b0(Integer.valueOf(pq9.j(this).b().g), (Integer) null, (Integer) null, tu0.G(fk4.d().getDisplayMetrics().density * f)));
        setPaddingRelative(0, 0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f));
        addView(rm2, new LinearLayout.LayoutParams(-1, tu0.G(((float) 220) * fk4.d().getDisplayMetrics().density)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.topMargin = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        layoutParams.bottomMargin = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        addView(appCompatTextView, layoutParams);
        addView(recyclerView);
    }

    private final void setSelectedBackground(Drawable drawable) {
        this.a.setBackgroundPreview(drawable);
    }

    public final void a(pm2 pm2) {
        rm2 rm2 = this.a;
        rm2.getClass();
        k29 k29 = pm2.e;
        e52 e52 = pm2.a;
        es8 es8 = pm2.c;
        by8 c2 = k29.c(k29, e52, es8, true);
        es8 es82 = pm2.b;
        by8 c3 = k29.c(k29, e52, es82, true);
        ppe ppe = rm2.a;
        if (c3 != null) {
            ppe.setTextMessageLayout(c3);
        }
        vs8 vs8 = rm2.c;
        ppe.setBackground(vs8);
        u6b u6b = es82.X;
        u6b.f();
        ppe.g(u6b.k, false);
        ppe ppe2 = rm2.b;
        if (c2 != null) {
            ppe2.setTextMessageLayout(c2);
        }
        vs8 vs82 = rm2.o;
        ppe2.setBackground(vs82);
        ppe2.setDateViewStatus(pm2.d);
        u6b u6b2 = es8.X;
        u6b2.f();
        ppe2.g(u6b2.k, false);
        nr2 nr2 = pm2.f;
        int[] iArr = nr2.g().a.o;
        vs8.getClass();
        bc7[] bc7Arr = vs8.z;
        vs8.u.o1(vs8, bc7Arr[0], iArr);
        ppe.setDateTextColor(nr2.g().d.m);
        ppe.setTextMessageColors(nr2.d(true));
        ppe.getBackground().invalidateSelf();
        ppe.requestLayout();
        int[] iArr2 = nr2.k().a.o;
        vs82.getClass();
        vs82.v.o1(vs82, bc7Arr[1], iArr2);
        ppe2.setDateTextColor(nr2.k().d.m);
        ppe2.setTextMessageColors(nr2.k());
        ppe2.getBackground().invalidateSelf();
        ppe2.requestLayout();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c = null;
    }

    public final void onThemeChanged(fka fka) {
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(fka.b().g);
        }
        this.b.setTextColor(fka.getText().e);
        qp4.d(qp4.u0.b(getContext()), this);
    }

    public final void setBackgroundSelectedListener(x52 x52) {
        this.c = x52;
    }

    public final void setThemeItems(List<c62> list) {
        Drawable drawable;
        T t;
        boolean z;
        this.o.E(list);
        Iterator<T> it = list.iterator();
        while (true) {
            drawable = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            Boolean bool = ((c62) t).a;
            if (bool != null) {
                z = bool.booleanValue();
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        c62 c62 = (c62) t;
        if (c62 != null) {
            drawable = c62.c;
        }
        setSelectedBackground(drawable);
    }
}
