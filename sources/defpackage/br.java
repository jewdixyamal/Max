package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.text.TextPaint;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.tamtam.nano.Protos;

/* renamed from: br  reason: default package */
public final class br extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                fka fka = (fka) obj2;
                br brVar = new br(3, (Continuation) obj3, 0);
                brVar.Y = (MaterialButton) obj;
                e5f e5f = e5f.a;
                brVar.o(e5f);
                return e5f;
            case 1:
                on5 on5 = (on5) obj;
                Throwable th = (Throwable) obj2;
                br brVar2 = new br((Object) (ug0) this.Y, (Continuation) obj3, 1);
                e5f e5f2 = e5f.a;
                brVar2.o(e5f2);
                return e5f2;
            case 2:
                fka fka2 = (fka) obj2;
                br brVar3 = new br(3, (Continuation) obj3, 2);
                brVar3.Y = (qv0) obj;
                e5f e5f3 = e5f.a;
                brVar3.o(e5f3);
                return e5f3;
            case 3:
                fka fka3 = (fka) obj2;
                br brVar4 = new br(3, (Continuation) obj3, 3);
                brVar4.Y = (AppCompatTextView) obj;
                e5f e5f4 = e5f.a;
                brVar4.o(e5f4);
                return e5f4;
            case 4:
                fka fka4 = (fka) obj2;
                br brVar5 = new br(3, (Continuation) obj3, 4);
                brVar5.Y = (w12) obj;
                e5f e5f5 = e5f.a;
                brVar5.o(e5f5);
                return e5f5;
            case 5:
                fka fka5 = (fka) obj2;
                br brVar6 = new br(3, (Continuation) obj3, 5);
                brVar6.Y = (CoordinatorLayout) obj;
                e5f e5f6 = e5f.a;
                brVar6.o(e5f6);
                return e5f6;
            case 6:
                ImageView imageView = (ImageView) obj;
                fka fka6 = (fka) obj2;
                br brVar7 = new br((Object) (mw4) this.Y, (Continuation) obj3, 6);
                e5f e5f7 = e5f.a;
                brVar7.o(e5f7);
                return e5f7;
            case 7:
                fka fka7 = (fka) obj2;
                br brVar8 = new br(3, (Continuation) obj3, 7);
                brVar8.Y = (ConstraintLayout) obj;
                e5f e5f8 = e5f.a;
                brVar8.o(e5f8);
                return e5f8;
            case 8:
                fka fka8 = (fka) obj2;
                br brVar9 = new br(3, (Continuation) obj3, 8);
                brVar9.Y = (EndlessRecyclerView2) obj;
                e5f e5f9 = e5f.a;
                brVar9.o(e5f9);
                return e5f9;
            case 9:
                w12 w12 = (w12) obj;
                fka fka9 = (fka) obj2;
                br brVar10 = new br((Object) (MainActivity) this.Y, (Continuation) obj3, 9);
                e5f e5f10 = e5f.a;
                brVar10.o(e5f10);
                return e5f10;
            case 10:
                fka fka10 = (fka) obj2;
                br brVar11 = new br(3, (Continuation) obj3, 10);
                brVar11.Y = (csb) obj;
                e5f e5f11 = e5f.a;
                brVar11.o(e5f11);
                return e5f11;
            case 11:
                fka fka11 = (fka) obj2;
                br brVar12 = new br(3, (Continuation) obj3, 11);
                brVar12.Y = (ImageView) obj;
                e5f e5f12 = e5f.a;
                brVar12.o(e5f12);
                return e5f12;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                on5 on52 = (on5) obj;
                Throwable th2 = (Throwable) obj2;
                br brVar13 = new br((Object) (rta) this.Y, (Continuation) obj3, 12);
                e5f e5f13 = e5f.a;
                brVar13.o(e5f13);
                return e5f13;
            case 13:
                fka fka12 = (fka) obj2;
                br brVar14 = new br(3, (Continuation) obj3, 13);
                brVar14.Y = (g6b) obj;
                e5f e5f14 = e5f.a;
                brVar14.o(e5f14);
                return e5f14;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                fka fka13 = (fka) obj2;
                br brVar15 = new br(3, (Continuation) obj3, 14);
                brVar15.Y = (f6b) obj;
                e5f e5f15 = e5f.a;
                brVar15.o(e5f15);
                return e5f15;
            default:
                on5 on53 = (on5) obj;
                Throwable th3 = (Throwable) obj2;
                br brVar16 = new br((Object) (mec) this.Y, (Continuation) obj3, 15);
                e5f e5f16 = e5f.a;
                brVar16.o(e5f16);
                return e5f16;
        }
    }

    public final Object o(Object obj) {
        pq9 pq9 = qp4.u0;
        e5f e5f = e5f.a;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                MaterialButton materialButton = (MaterialButton) this.Y;
                xoe text = pq9.j(materialButton).getText();
                materialButton.setTextColor(new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{text.j, pq9.j(materialButton).getText().g}));
                ne0 b = pq9.j(materialButton).b();
                materialButton.setBackgroundTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{b.g, pq9.j(materialButton).b().j}));
                materialButton.setStrokeColor(ColorStateList.valueOf(pq9.j(materialButton).i().b.b));
                return e5f;
            case 1:
                od2.a0(obj);
                ug0 ug0 = (ug0) this.Y;
                ug0.a.unregisterActivityLifecycleCallbacks(ug0.f);
                return e5f;
            case 2:
                od2.a0(obj);
                qv0 qv0 = (qv0) this.Y;
                TextPaint textPaint = qv0.A0;
                pq9.j(qv0).getText();
                textPaint.setColor(-1);
                qv0.B0.setColor(pq9.j(qv0).getText().e);
                boolean z = qv0.R0;
                Paint paint = qv0.x0;
                if (z) {
                    paint.setColor(pq9.j(qv0).a().s().b.e);
                } else {
                    paint.setColor(pq9.j(qv0).a().d(true).a.a.a);
                }
                qv0.y0.setColor(pq9.j(qv0).a().s().b.m);
                qv0.z0.setColor(pq9.j(qv0).a().d(true).a.a.c);
                sz6 sz6 = qv0.L0;
                if (sz6 != null) {
                    sz6.b = new int[]{0, pq9.j(qv0).e().e.a.a};
                }
                pq9.j(qv0).getIcon();
                qv0.J0 = ColorStateList.valueOf(-1);
                qv0.K0 = ColorStateList.valueOf(pq9.j(qv0).getIcon().f);
                qv0.invalidate();
                return e5f;
            case 3:
                od2.a0(obj);
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.Y;
                appCompatTextView.setTextColor(pq9.j(appCompatTextView).getText().i);
                return e5f;
            case 4:
                od2.a0(obj);
                w12 w12 = (w12) this.Y;
                w12.setBackgroundColor(pq9.j(w12).a().h().a.d);
                return e5f;
            case 5:
                od2.a0(obj);
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.Y;
                coordinatorLayout.setBackgroundColor(pq9.j(coordinatorLayout).b().j);
                return e5f;
            case 6:
                od2.a0(obj);
                int i = mw4.H0;
                ImageView imageView = (ImageView) ((mw4) this.Y).a;
                int i2 = pq9.j(imageView).d().a.a.h;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, shapeDrawable));
                return e5f;
            case 7:
                od2.a0(obj);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.Y;
                constraintLayout.setBackgroundColor(pq9.j(constraintLayout).b().j);
                return e5f;
            case 8:
                od2.a0(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.Y;
                endlessRecyclerView2.setBackgroundColor(pq9.j(endlessRecyclerView2).b().m);
                qp4.d(pq9.b(endlessRecyclerView2.getContext()), endlessRecyclerView2);
                endlessRecyclerView2.Y();
                return e5f;
            case 9:
                od2.a0(obj);
                l91 l91 = ((MainActivity) this.Y).W0;
                if (l91 != null) {
                    l91.j();
                }
                return e5f;
            case 10:
                od2.a0(obj);
                csb csb = (csb) this.Y;
                csb.setBackgroundColor(pq9.j(csb).a().h().a.d);
                return e5f;
            case 11:
                od2.a0(obj);
                ImageView imageView2 = (ImageView) this.Y;
                imageView2.setImageTintList(ColorStateList.valueOf(pq9.j(imageView2).getIcon().f));
                imageView2.setBackgroundColor(pq9.j(imageView2).b().a.g);
                return e5f;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                od2.a0(obj);
                rta rta = (rta) this.Y;
                rta.a.unregisterActivityLifecycleCallbacks(rta.c);
                return e5f;
            case 13:
                od2.a0(obj);
                g6b g6b = (g6b) this.Y;
                int i3 = g6b.getCurrentTheme().d().a.a.d;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
                shapeDrawable2.getPaint().setColor(g6b.getCurrentTheme().b().g);
                g6b.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), shapeDrawable2, (Drawable) null));
                return e5f;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                od2.a0(obj);
                f6b f6b = (f6b) this.Y;
                pq9.j(f6b).b();
                f6b.setBackground(new ColorDrawable(-1728053248));
                return e5f;
            default:
                od2.a0(obj);
                ((x77) ((mec) this.Y).a).cancel((CancellationException) null);
                return e5f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Y = obj;
    }
}
