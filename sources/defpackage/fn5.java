package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: fn5  reason: default package */
public final class fn5 extends ndc {
    public final int X = tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density);
    public final int Y;
    public final int Z;
    public final Context a;
    public final m56 b;
    public final fi9 c = new fi9(3);
    public final Rect o = new Rect();
    public boolean s0;
    public RecyclerView t0;
    public final je7 u0;

    public fn5(Application application, o59 o59) {
        this.a = application;
        this.b = o59;
        float f = (float) 6;
        this.Y = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.Z = tu0.G(f * fk4.d().getDisplayMetrics().density);
        this.u0 = tu0.r(3, new es3(16, this));
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, zdc zdc) {
        fi9 fi9 = this.c;
        if (fi9.e != 0) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt.getAlpha() != 0.0f) {
                    dec T = recyclerView.T(childAt);
                    ht8 ht8 = T instanceof ht8 ? (ht8) T : null;
                    if (ht8 != null) {
                        int i2 = ht8.Y;
                        View view = ht8.a;
                        zs8 zs8 = view instanceof zs8 ? (zs8) view : null;
                        if (zs8 != null) {
                            boolean z = (67108864 & i2) == 0;
                            RectF rectF = zs8.y0;
                            if (z || ry8.a(i2, 0) || ry8.a(i2, 131072)) {
                                rectF.setEmpty();
                                zs8.setOnAvatarClickListener$message_list_release((m56) null);
                            } else {
                                g5a g5a = (g5a) fi9.d(zs8.getAvatarId());
                                if (g5a != null) {
                                    Rect rect = this.o;
                                    zs8.getDrawingRect(rect);
                                    recyclerView.offsetDescendantRectToMyCoords(zs8, rect);
                                    g5a.setAlpha(tu0.G(childAt.getAlpha() * ((float) 255)));
                                    float translationX = view.getTranslationX() + ((float) this.Z);
                                    float contentViewTopMargin = (float) (zs8.getContentViewTopMargin() + this.Y);
                                    int save = canvas.save();
                                    canvas.translate(((float) rect.left) + translationX, ((float) rect.top) + contentViewTopMargin);
                                    try {
                                        g5a.draw(canvas);
                                        rectF.left = translationX;
                                        rectF.top = contentViewTopMargin;
                                        float f = (float) zs8.b;
                                        rectF.right = translationX + f;
                                        rectF.bottom = contentViewTopMargin + f;
                                        zs8.setOnAvatarClickListener$message_list_release(this.b);
                                    } finally {
                                        canvas.restoreToCount(save);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
