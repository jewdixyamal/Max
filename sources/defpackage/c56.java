package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import java.io.FileOutputStream;
import one.me.image.crop.view.ImageCropView;
import ru.ok.messages.media.crop.FrgTamCropImage;

/* renamed from: c56  reason: default package */
public final /* synthetic */ class c56 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgTamCropImage b;

    public /* synthetic */ c56(FrgTamCropImage frgTamCropImage, int i) {
        this.a = i;
        this.b = frgTamCropImage;
    }

    public final void run() {
        q5 g1;
        switch (this.a) {
            case 0:
                FrgTamCropImage frgTamCropImage = this.b;
                ((y8a) ((ed3) frgTamCropImage.p1.b)).b().f("LOCAL_MEDIA_ROTATE");
                wa6 wa6 = frgTamCropImage.B1.a;
                Matrix matrix = wa6.D0;
                matrix.reset();
                float currentScale = 1.0f / wa6.getCurrentScale();
                matrix.postScale(currentScale, currentScale);
                RectF rectF = wa6.E0;
                rectF.set(wa6.C0);
                matrix.mapRect(rectF);
                float width = rectF.width();
                wa6 wa62 = frgTamCropImage.B1.a;
                RectF rectF2 = wa62.C0;
                float centerX = rectF2.centerX();
                float centerY = rectF2.centerY();
                Matrix matrix2 = wa62.u0;
                matrix2.postRotate(90.0f, centerX, centerY);
                wa62.setImageMatrix(matrix2);
                foa foa = frgTamCropImage.B1.b;
                float f = 1.0f / foa.t0;
                foa.t0 = f;
                RectF rectF3 = foa.a;
                foa.a(rectF3, f);
                foa.b();
                goa goa = foa.M0;
                if (goa != null) {
                    ((ImageCropView) goa).a.setCropRect(rectF3);
                }
                foa.postInvalidateOnAnimation();
                wa6 wa63 = frgTamCropImage.B1.a;
                Matrix matrix3 = wa63.D0;
                matrix3.reset();
                float currentScale2 = 1.0f / wa63.getCurrentScale();
                matrix3.postScale(currentScale2, currentScale2);
                RectF rectF4 = wa63.E0;
                rectF4.set(wa63.C0);
                matrix3.mapRect(rectF4);
                float height = rectF4.height() / width;
                wa6 wa64 = frgTamCropImage.B1.a;
                RectF rectF5 = wa64.C0;
                float centerX2 = rectF5.centerX();
                float centerY2 = rectF5.centerY();
                if (height != 0.0f) {
                    Matrix matrix4 = wa64.u0;
                    matrix4.postScale(height, height, centerX2, centerY2);
                    wa64.setImageMatrix(matrix4);
                }
                frgTamCropImage.B1.a();
                return;
            case 1:
                FrgTamCropImage frgTamCropImage2 = this.b;
                ((y8a) ((ed3) frgTamCropImage2.p1.b)).b().f("LOCAL_MEDIA_FLIP");
                wa6 wa65 = frgTamCropImage2.B1.a;
                RectF rectF6 = wa65.C0;
                float centerX3 = rectF6.centerX();
                float centerY3 = rectF6.centerY();
                Matrix matrix5 = wa65.u0;
                matrix5.postScale(-1.0f, 1.0f, centerX3, centerY3);
                wa65.setImageMatrix(matrix5);
                frgTamCropImage2.B1.a();
                return;
            case 2:
                wa6 wa66 = this.b.B1.a;
                wa66.F0 = 0.0f;
                wa66.f();
                return;
            case 3:
                this.b.e1();
                return;
            case 4:
                FrgTamCropImage frgTamCropImage3 = this.b;
                frgTamCropImage3.getClass();
                new sa3(1, new c56(frgTamCropImage3, 5)).k(muc.a()).h(ce.a()).i(new iq1(new z16(5, frgTamCropImage3), 0, new c56(frgTamCropImage3, 6)));
                return;
            case 5:
                FrgTamCropImage frgTamCropImage4 = this.b;
                ImageCropView imageCropView = frgTamCropImage4.B1;
                Bitmap.CompressFormat compressFormat = frgTamCropImage4.Z.getBoolean("ru.ok.tamtam.extra.SAVE_AS_PNG") ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
                wa6 wa67 = imageCropView.a;
                Bitmap viewBitmap = wa67.getViewBitmap();
                String imageOutputPath = wa67.getImageOutputPath();
                nz3 cropState = wa67.getCropState();
                if (viewBitmap != null && !viewBitmap.isRecycled()) {
                    Matrix matrix6 = new Matrix();
                    matrix6.setValues(cropState.c);
                    Matrix matrix7 = new Matrix();
                    matrix7.set(matrix6);
                    float K = 1.0f / f46.K(matrix6);
                    matrix7.postScale(K, K, 0.0f, 0.0f);
                    float[] fArr = f46.c;
                    matrix7.getValues(fArr);
                    matrix7.getValues(fArr);
                    matrix7.postTranslate(-fArr[2], -fArr[5]);
                    RectF rectF7 = cropState.a;
                    matrix7.mapRect(rectF7);
                    matrix7.postTranslate(-rectF7.left, -rectF7.top);
                    Bitmap createBitmap = Bitmap.createBitmap((int) rectF7.width(), (int) rectF7.height(), Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap).drawBitmap(viewBitmap, matrix7, (Paint) null);
                    FileOutputStream fileOutputStream = new FileOutputStream(imageOutputPath);
                    try {
                        createBitmap.compress(compressFormat, 100, fileOutputStream);
                        createBitmap.recycle();
                        fileOutputStream.close();
                        return;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                } else {
                    throw new IllegalStateException("bitmap recycled or null");
                }
            default:
                FrgTamCropImage frgTamCropImage5 = this.b;
                if (frgTamCropImage5.g1() != null && (g1 = frgTamCropImage5.g1()) != null) {
                    Intent intent = new Intent();
                    Uri uri = (Uri) frgTamCropImage5.Z.getParcelable("ru.ok.tamtam.extra.RESULT_URI");
                    intent.putExtra("ru.ok.tamtam.extra.RESULT_URI", uri);
                    hm9.m("ru.ok.messages.media.crop.FrgTamCropImage", "finishWithSuccess: result: %s", uri.toString());
                    wa6 wa68 = frgTamCropImage5.B1.a;
                    if (!wa68.getInitialMatrix().equals(wa68.u0)) {
                        intent.putExtra("ru.ok.tamtam.extra.CROP_STATE", frgTamCropImage5.B1.getCropState());
                    }
                    g1.setResult(-1, intent);
                    frgTamCropImage5.e1();
                    return;
                }
                return;
        }
        throw th;
    }
}
