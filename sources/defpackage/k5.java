package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;
import ru.ok.messages.views.ActAvatarCrop;
import ru.ok.messages.views.widgets.AvatarCropView;

/* renamed from: k5  reason: default package */
public final /* synthetic */ class k5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActAvatarCrop b;

    public /* synthetic */ k5(ActAvatarCrop actAvatarCrop, int i) {
        this.a = i;
        this.b = actAvatarCrop;
    }

    public final void onClick(View view) {
        ActAvatarCrop actAvatarCrop = this.b;
        switch (this.a) {
            case 0:
                oz3 oz3 = (oz3) actAvatarCrop.U0.getZoomableController();
                if (!oz3.d) {
                    float f = oz3.p;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{90.0f});
                    ofFloat.setDuration(250);
                    ofFloat.addUpdateListener(new pmc(oz3, f, 2));
                    ofFloat.addListener(oz3);
                    ofFloat.start();
                    actAvatarCrop.c1 = !actAvatarCrop.c1;
                    Matrix matrix = actAvatarCrop.b1;
                    Point point = actAvatarCrop.a1;
                    matrix.postRotate(90.0f, ((float) point.x) / 2.0f, ((float) point.y) / 2.0f);
                    return;
                }
                return;
            case 1:
                oz3 oz32 = (oz3) actAvatarCrop.U0.getZoomableController();
                if (!oz32.d) {
                    float L = f46.L(oz32.k, 0);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{L, -L});
                    ofFloat2.setDuration(250);
                    ofFloat2.addUpdateListener(new z00(6, (Object) oz32));
                    ofFloat2.addListener(oz32);
                    ofFloat2.start();
                    Matrix matrix2 = actAvatarCrop.b1;
                    Point point2 = actAvatarCrop.a1;
                    matrix2.postScale(-1.0f, 1.0f, ((float) point2.x) / 2.0f, ((float) point2.y) / 2.0f);
                    return;
                }
                return;
            case 2:
                int i = ActAvatarCrop.d1;
                actAvatarCrop.finish();
                return;
            case 3:
                actAvatarCrop.c1 = false;
                AvatarCropView avatarCropView = actAvatarCrop.U0;
                oz3 oz33 = (oz3) avatarCropView.getZoomableController();
                oz33.reset();
                oz33.e();
                if (avatarCropView.O0 > 0 && avatarCropView.P0 == 0) {
                    ((oz3) avatarCropView.getZoomableController()).d(avatarCropView.O0);
                }
                avatarCropView.f(oz33.k);
                actAvatarCrop.b1.reset();
                actAvatarCrop.Y0.setVisibility(8);
                return;
            default:
                int i2 = ActAvatarCrop.d1;
                ((y8a) ((ed3) actAvatarCrop.K0.b)).getClass();
                jyc jyc = jyc.a;
                q1a q1a = new q1a(2, new l5(0, actAvatarCrop));
                hle t = jyc.t();
                t.getClass();
                q1a.m(((jle) t).a()).i(((jle) jyc.t()).b()).k(new iq1(new m5(actAvatarCrop, 0), 2, new m5(actAvatarCrop, 1)));
                return;
        }
    }
}
