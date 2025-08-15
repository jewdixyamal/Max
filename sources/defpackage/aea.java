package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;

/* renamed from: aea  reason: default package */
public final class aea implements op0 {
    public final je7 a;

    public aea(je7 je7) {
        this.a = je7;
    }

    public RenderNode a() {
        return (RenderNode) this.a.getValue();
    }

    public void b() {
        a().discardDisplayList();
    }

    public void c(Canvas canvas, Bitmap bitmap) {
        canvas.drawRenderNode(a());
    }

    public void d(Bitmap bitmap, float f) {
        a().setPosition(0, 0, bitmap.getWidth(), bitmap.getHeight());
        a().beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        a().endRecording();
        a().setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR));
    }

    public void p(int i) {
        a().setAlpha(((float) i) / 255.0f);
    }

    public aea(int i) {
        switch (i) {
            case 2:
                this.a = wjd.a.getAccessor().d(af8.class);
                return;
            default:
                this.a = tu0.r(2, new hbc(4));
                return;
        }
    }
}
