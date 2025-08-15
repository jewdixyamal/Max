package one.me.inappreview.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.richvector.EnhancedVectorDrawable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/inappreview/ui/FakeInAppReviewBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "in-app-review_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class FakeInAppReviewBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] H0;
    public final ShapeDrawable A0;
    public final ShapeDrawable B0;
    public final ShapeDrawable C0;
    public final ShapeDrawable D0;
    public final khe E0;
    public final dd4 F0;
    public boolean G0;
    public final q7c y0 = viewBinding(wba.a);
    public final q7c z0 = viewBinding(wba.h);

    static {
        Class<FakeInAppReviewBottomSheet> cls = FakeInAppReviewBottomSheet.class;
        H0 = new bc7[]{new hob(cls, "rateView", "getRateView()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), zr6.e(nec.a, cls, "thankView", "getThankView()Landroid/widget/FrameLayout;", 0)};
    }

    public FakeInAppReviewBottomSheet() {
        super((Bundle) null, 1, (z84) null);
        float[] fArr = {fk4.d().getDisplayMetrics().density * 50.0f, fk4.d().getDisplayMetrics().density * 50.0f, fk4.d().getDisplayMetrics().density * 50.0f, fk4.d().getDisplayMetrics().density * 50.0f, fk4.d().getDisplayMetrics().density * 50.0f, fk4.d().getDisplayMetrics().density * 50.0f, fk4.d().getDisplayMetrics().density * 50.0f, fk4.d().getDisplayMetrics().density * 50.0f};
        this.A0 = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(fk4.d().getDisplayMetrics().density * 1.0f);
        this.B0 = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable2.getPaint().setColor(-16611745);
        this.C0 = shapeDrawable2;
        this.D0 = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        this.E0 = new khe(new es3(13, this));
        this.F0 = new dd4(21, this);
        this.G0 = true;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [g5c, androidx.constraintlayout.widget.ConstraintLayout, android.view.View, java.lang.Object, android.view.ViewGroup] */
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(wba.a);
        AppCompatImageView appCompatImageView = new AppCompatImageView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatImageView.setId(wba.b);
        appCompatImageView.setImageDrawable(appCompatImageView.getContext().getPackageManager().getApplicationIcon(appCompatImageView.getContext().getApplicationInfo()));
        float f = (float) 44;
        constraintLayout.addView(appCompatImageView, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatTextView.setId(wba.g);
        i4f.c.b(appCompatTextView, du4.b);
        appCompatTextView.setText(jpc.f3);
        pq9 pq9 = qp4.u0;
        appCompatTextView.setTextColor(pq9.j(appCompatTextView).getText().e);
        constraintLayout.addView(appCompatTextView, -2, -2);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatTextView2.setId(wba.f);
        i4f.k.b(appCompatTextView2, du4.b);
        appCompatTextView2.setText(yba.d);
        appCompatTextView2.setTextColor(pq9.j(appCompatTextView2).getText().i);
        constraintLayout.addView(appCompatTextView2, -2, -2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatTextView3.setId(wba.c);
        appCompatTextView3.setGravity(17);
        appCompatTextView3.setBackground(new RippleDrawable(ColorStateList.valueOf(pq9.j(appCompatTextView3).d().a.a.c), this.B0, this.A0));
        appCompatTextView3.setText(yba.b);
        appCompatTextView3.setTextColor(-16611745);
        tu0.K(appCompatTextView3, 300, new kb5(this, 0));
        constraintLayout.addView(appCompatTextView3, 0, tu0.G(fk4.d().getDisplayMetrics().density * f));
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(constraintLayout.getContext(), (AttributeSet) null);
        appCompatTextView4.setId(wba.e);
        appCompatTextView4.setGravity(17);
        appCompatTextView4.setBackground(this.D0);
        appCompatTextView4.setTextColor(pq9.j(appCompatTextView4).getText().i);
        appCompatTextView4.setText(yba.c);
        constraintLayout.addView(appCompatTextView4, 0, tu0.G(f * fk4.d().getDisplayMetrics().density));
        Context context = constraintLayout.getContext();
        ? constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.G0 = -1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < 5) {
            ImageView imageView = new ImageView(context);
            imageView.setId(View.generateViewId());
            int i2 = i + 1;
            imageView.setContentDescription(imageView.getResources().getQuantityString(xba.b, i2, new Object[]{Integer.valueOf(i2)}));
            imageView.setImageDrawable(new EnhancedVectorDrawable(context, vba.c));
            imageView.setOnClickListener(new kg3(i, 2, constraintLayout2));
            v3c.y(new ze2(3, (Continuation) null, 4), imageView);
            float f2 = (float) 28;
            constraintLayout2.addView(imageView, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
            arrayList.add(imageView);
            i = i2;
            appCompatTextView3 = appCompatTextView3;
        }
        AppCompatTextView appCompatTextView5 = appCompatTextView3;
        dj3 q = fp3.q(constraintLayout2);
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                ImageView imageView2 = (ImageView) next;
                if (i3 == 0) {
                    int id = imageView2.getId();
                    q.d(id, 6, 0, 6);
                    q.d(id, 7, ((ImageView) arrayList.get(1)).getId(), 6);
                    q.g(id).d.V = 1;
                } else if (i3 == arrayList.size() - 1) {
                    int id2 = imageView2.getId();
                    q.d(id2, 6, ((ImageView) arrayList.get(i3 - 1)).getId(), 7);
                    q.d(id2, 7, 0, 7);
                } else {
                    int id3 = imageView2.getId();
                    q.d(id3, 6, ((ImageView) arrayList.get(i3 - 1)).getId(), 7);
                    q.d(id3, 7, ((ImageView) arrayList.get(i4)).getId(), 6);
                }
                i3 = i4;
            } else {
                y53.R();
                throw null;
            }
        }
        q.a(constraintLayout2);
        constraintLayout2.setContentDescription(constraintLayout2.getResources().getQuantityString(xba.a, 5, new Object[]{Integer.valueOf(constraintLayout2.getSelected()), 5}));
        constraintLayout2.setId(wba.d);
        constraintLayout2.setOnSelectListener(new u00((Object) appCompatTextView4, (Object) this, (Object) frameLayout2, 9));
        constraintLayout.addView(constraintLayout2, -1, -2);
        View view = constraintLayout2;
        v3c.y(new lb5(this, appCompatTextView, appCompatTextView2, appCompatTextView4, constraintLayout2, (Continuation) null), constraintLayout);
        dj3 q2 = fp3.q(constraintLayout);
        int id4 = appCompatImageView.getId();
        q2.d(id4, 3, 0, 3);
        float f3 = (float) 24;
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q2, 3, id4, 4));
        q2.d(id4, 6, 0, 6);
        new l2a(q2, 6, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        int id5 = appCompatTextView.getId();
        q2.d(id5, 3, appCompatImageView.getId(), 3);
        q2.d(id5, 6, appCompatImageView.getId(), 7);
        l2a l2a = new l2a(q2, 6, id5, 4);
        float f4 = (float) 12;
        l2a.e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id6 = appCompatTextView2.getId();
        q2.d(id6, 3, appCompatTextView.getId(), 4);
        new l2a(q2, 3, id6, 4).e(tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
        q2.d(id6, 6, appCompatImageView.getId(), 7);
        new l2a(q2, 6, id6, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id7 = view.getId();
        q2.d(id7, 3, appCompatTextView2.getId(), 4);
        float f5 = (float) 40;
        au1.p(f5, fk4.d().getDisplayMetrics().density, new l2a(q2, 3, id7, 4));
        q2.d(id7, 6, 0, 6);
        float f6 = (float) 20;
        au1.p(f6, fk4.d().getDisplayMetrics().density, new l2a(q2, 6, id7, 4));
        q2.d(id7, 7, 0, 7);
        new l2a(q2, 7, id7, 4).e(tu0.G(f6 * fk4.d().getDisplayMetrics().density));
        int id8 = appCompatTextView5.getId();
        q2.d(id8, 3, view.getId(), 4);
        au1.p(f5, fk4.d().getDisplayMetrics().density, new l2a(q2, 3, id8, 4));
        q2.d(id8, 6, 0, 6);
        new l2a(q2, 6, id8, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        q2.d(id8, 7, appCompatTextView4.getId(), 6);
        float f7 = (float) 8;
        au1.p(f7, fk4.d().getDisplayMetrics().density, new l2a(q2, 7, id8, 4));
        q2.d(id8, 4, 0, 4);
        new l2a(q2, 4, id8, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        int id9 = appCompatTextView4.getId();
        q2.d(id9, 3, view.getId(), 4);
        new l2a(q2, 3, id9, 4).e(tu0.G(f5 * fk4.d().getDisplayMetrics().density));
        q2.d(id9, 6, appCompatTextView5.getId(), 7);
        au1.p(f7, fk4.d().getDisplayMetrics().density, new l2a(q2, 6, id9, 4));
        q2.d(id9, 7, 0, 7);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q2, 7, id9, 4));
        q2.d(id9, 4, 0, 4);
        new l2a(q2, 4, id9, 4).e(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        q2.a(constraintLayout);
        frameLayout2.addView(constraintLayout);
        kr0 kr0 = new kr0((uu3) this, (k56) new yf3(frameLayout2, 9, this));
        if (getRouter() != null) {
            getRouter().a(kr0);
        } else {
            addLifecycleListener(new o9(this, kr0, 4));
        }
        return frameLayout2;
    }
}
