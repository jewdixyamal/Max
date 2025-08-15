package defpackage;

import ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl;

/* renamed from: zr0  reason: default package */
public final /* synthetic */ class zr0 implements Runnable {
    public final /* synthetic */ BrushWidthViewImpl a;
    public final /* synthetic */ float b;

    public /* synthetic */ zr0(BrushWidthViewImpl brushWidthViewImpl, float f) {
        this.a = brushWidthViewImpl;
        this.b = f;
    }

    public final void run() {
        BrushWidthViewImpl brushWidthViewImpl = this.a;
        float f = brushWidthViewImpl.A0;
        float f2 = (this.b - f) / (brushWidthViewImpl.B0 - f);
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float f3 = brushWidthViewImpl.y0;
        brushWidthViewImpl.w0 = f3 - ((f3 - brushWidthViewImpl.x0) * f2);
        brushWidthViewImpl.invalidate();
    }
}
