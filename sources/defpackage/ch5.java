package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ch5  reason: default package */
public final class ch5 extends View {
    public is0 a = this.a;
    public final oh5 b;
    public final yi5 c;
    public final ph5 o;

    public ch5(Context context) {
        super(context, (AttributeSet) null);
        pq9 pq9 = qp4.u0;
        this.a = pq9.j(this).a().d(true);
        int i = pq9.j(this).a().d(true).b.f;
        oh5 oh5 = new oh5(context);
        oh5.setCallback(this);
        this.b = oh5;
        yi5 yi5 = new yi5();
        float f = (float) 12;
        int G = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density) * 2;
        int G2 = tu0.G(fk4.d().getDisplayMetrics().density * f) - G;
        int G3 = tu0.G(f * fk4.d().getDisplayMetrics().density) - G;
        int G4 = tu0.G(((float) 5) * fk4.d().getDisplayMetrics().density);
        wi5 wi5 = yi5.h;
        wi5.c = wmd.m(wi5.c, (float) G2, 0.0f, 2);
        wi5.d = wmd.m(wi5.d, (float) G3, 0.0f, 2);
        wi5.b = wmd.m(wi5.b, (float) G4, 0.0f, 2);
        yi5.c(i, i);
        yi5.setCallback(this);
        this.c = yi5;
        ph5 ph5 = new ph5(context, oh5);
        ph5.setCallback(this);
        this.o = ph5;
        ph5.onThemeChanged(pq9.j(this));
        uf5 uf5 = ph5.c;
        if (uf5 != null) {
            int c2 = pq9.j(this).a().c(uf5.b().o);
            yi5.c(c2, c2);
        }
    }

    public final void a(Drawable drawable, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(((float) (getWidth() - drawable.getBounds().width())) * 0.5f, ((float) (getHeight() - drawable.getBounds().height())) * 0.5f);
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void b(uf5 uf5, boolean z) {
        yi5 yi5 = this.c;
        if (!wmd.o(yi5.f, 0.0f, 0.01f)) {
            yi5.f = 0.0f;
            if (!z) {
                yi5.e = 0.0f;
            }
            yi5.invalidateSelf();
        }
        ph5 ph5 = this.o;
        ph5.a(uf5);
        uf5 uf52 = ph5.c;
        if (uf52 != null) {
            int c2 = qp4.u0.j(this).a().c(uf52.b().o);
            yi5.c(c2, c2);
        }
    }

    public final void c(uf5 uf5, float f, boolean z) {
        float f2 = f / 100.0f;
        yi5 yi5 = this.c;
        ui5 ui5 = yi5.c;
        ui5 ui52 = ui5.b;
        xi5 xi5 = yi5.i;
        if (ui5 != ui52 || !wmd.o(xi5.h, f2, 0.01f) || !wmd.o(yi5.f, 1.0f, 0.01f)) {
            boolean b2 = yi5.b();
            wi5 wi5 = yi5.h;
            if (!b2) {
                yi5.b = ui52;
                wi5.h = 1.0f;
                wi5.i = 1.0f;
                wi5.j = 1.0f;
                xi5.i = 1.0f;
                xi5.k = 1.0f;
            }
            yi5.c = ui52;
            yi5.f = 1.0f;
            xi5.h = f2;
            wi5.j = 1.0f;
            if (!z) {
                yi5.b = ui52;
                xi5.g = f2;
                xi5.i = 1.0f;
                xi5.k = 1.0f;
                wi5.h = 1.0f;
                wi5.i = 1.0f;
                wi5.j = 1.0f;
                yi5.e = 1.0f;
            }
            yi5.invalidateSelf();
        }
        ph5 ph5 = this.o;
        ph5.a(uf5);
        uf5 uf52 = ph5.c;
        if (uf52 != null) {
            int c2 = qp4.u0.j(this).a().c(uf52.b().o);
            yi5.c(c2, c2);
        }
    }

    public final void d(uf5 uf5, boolean z) {
        yi5 yi5 = this.c;
        ui5 ui5 = yi5.c;
        ui5 ui52 = ui5.a;
        wi5 wi5 = yi5.h;
        if (ui5 != ui52 || !wmd.o(wi5.j, 0.0f, 0.01f) || !wmd.o(yi5.f, 1.0f, 0.01f)) {
            boolean b2 = yi5.b();
            xi5 xi5 = yi5.i;
            if (!b2) {
                yi5.b = ui52;
                wi5.h = 1.0f;
                wi5.i = 0.0f;
                wi5.j = 0.0f;
                xi5.i = 0.0f;
                xi5.k = 0.0f;
            }
            yi5.c = ui52;
            wi5.j = 0.0f;
            yi5.f = 1.0f;
            if (!z) {
                yi5.b = ui52;
                wi5.h = 1.0f;
                wi5.i = 0.0f;
                wi5.j = 0.0f;
                xi5.i = 0.0f;
                xi5.k = 0.0f;
                yi5.e = 1.0f;
            }
            yi5.invalidateSelf();
        }
        ph5 ph5 = this.o;
        ph5.a(uf5);
        uf5 uf52 = ph5.c;
        if (uf52 != null) {
            int c2 = qp4.u0.j(this).a().c(uf52.b().o);
            yi5.c(c2, c2);
        }
    }

    public final void onDraw(Canvas canvas) {
        a(this.b, canvas);
        long drawingTime = getDrawingTime();
        yi5 yi5 = this.c;
        boolean b2 = yi5.b();
        wi5 wi5 = yi5.h;
        if (b2) {
            long j = yi5.j;
            float d = j == 0 ? 0.0f : ote.d(((float) (drawingTime - j)) / 1000.0f, 0.0f, 0.1f) * yi5.g;
            yi5.j = drawingTime;
            float f = 3.0f * d;
            if (wmd.o(yi5.f, yi5.e, f)) {
                yi5.e = yi5.f;
            } else {
                float f2 = yi5.e;
                yi5.e = (Math.signum(yi5.f - f2) * f) + f2;
                yi5.invalidateSelf();
            }
            int ordinal = yi5.a().ordinal();
            if (ordinal != 0) {
                int i = 1;
                xi5 xi5 = yi5.i;
                if (ordinal == 1) {
                    yi5.invalidateSelf();
                    float f3 = wi5.i + f;
                    wi5.i = f3;
                    if (((double) f3) >= 1.0d) {
                        wi5.i = 1.0f;
                        yi5.b = ui5.b;
                        xi5.i = 1.0f;
                        xi5.f = 0.0f;
                        xi5.g = 0.0f;
                    }
                } else if (ordinal == 2) {
                    yi5.invalidateSelf();
                    float f4 = d * 2.0f;
                    float f5 = xi5.g - f4;
                    xi5.g = f5;
                    if (f5 <= 0.0f) {
                        xi5.g = 0.0f;
                    } else {
                        i = 0;
                    }
                    float f6 = xi5.k - f;
                    xi5.k = f6;
                    if (f6 <= 0.0f) {
                        xi5.k = 0.0f;
                        i++;
                    }
                    float f7 = xi5.f + f4;
                    xi5.f = f7;
                    if (((double) f7) > 0.9900000002235174d) {
                        xi5.f = 1.0f;
                        i++;
                    }
                    if (i == 3) {
                        xi5.i = 0.0f;
                        xi5.k = 0.0f;
                        wi5.j = 0.0f;
                        wi5.i = 1.0f;
                        wi5.h = 1.0f;
                        yi5.b = ui5.a;
                    }
                } else if (ordinal == 3) {
                    yi5.invalidateSelf();
                    float f8 = 2.0f * d;
                    xi5.f = (xi5.f + d) % 1.0f;
                    xi5.i = 1.0f;
                    xi5.k = Math.min(1.0f, xi5.k + f);
                    if (wmd.o(xi5.g, xi5.h, f8)) {
                        xi5.g = xi5.h;
                    } else {
                        float f9 = xi5.g;
                        xi5.g = (Math.signum(xi5.h - f9) * f8) + f9;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!wmd.o(wi5.j, wi5.i, f)) {
                float f10 = wi5.i;
                wi5.i = (Math.signum(wi5.j - f10) * f) + f10;
                yi5.invalidateSelf();
            } else {
                wi5.i = wi5.j;
            }
        }
        ph5 ph5 = this.o;
        ph5.setAlpha((int) (((float) Math.sqrt((double) Math.max(1.0f - yi5.e, 1.0f - wi5.i))) * 255.0f));
        ph5.draw(canvas);
        a(yi5, canvas);
    }

    public final void onMeasure(int i, int i2) {
        int G = tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
        this.b.setBounds(0, 0, tu0.G(((float) 28) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 36) * fk4.d().getDisplayMetrics().density));
        float f = (float) 20;
        this.c.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        this.o.setBounds(0, 0, G, G);
        setMeasuredDimension(G, G);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable((Drawable) null);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.c) {
            ph5 ph5 = this.o;
            if (ph5 != drawable) {
                return ph5.b == drawable;
            }
            ph5.getClass();
        }
    }
}
