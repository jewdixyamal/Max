package one.me.sdk.gl.effects.objects;

import android.content.Context;
import androidx.annotation.Keep;

@Keep
public final class TrivialFragmentShader extends lbg {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TrivialFragmentShader(int r3, boolean r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r4 == 0) goto L_0x000a
            java.lang.String r1 = "#extension GL_OES_EGL_image_external : require\n"
            goto L_0x000c
        L_0x000a:
            java.lang.String r1 = ""
        L_0x000c:
            r0.append(r1)
            java.lang.String r1 = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform "
            r0.append(r1)
            if (r4 == 0) goto L_0x0019
            java.lang.String r4 = "samplerExternalOES"
            goto L_0x001b
        L_0x0019:
            java.lang.String r4 = "sampler2D"
        L_0x001b:
            java.lang.String r1 = " sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"
            java.lang.String r4 = defpackage.zr6.l(r0, r4, r1)
            r2.<init>(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.gl.effects.objects.TrivialFragmentShader.<init>(int, boolean):void");
    }

    public /* bridge */ /* synthetic */ String getSource() {
        return super.getSource();
    }

    public /* bridge */ /* synthetic */ int getTextureCoordLoc() {
        return super.getTextureCoordLoc();
    }

    public /* bridge */ /* synthetic */ int getVertexCoordLoc() {
        return super.getVertexCoordLoc();
    }

    public /* bridge */ /* synthetic */ void initPart(int i) {
    }

    public /* bridge */ /* synthetic */ void prepareTextures(Context context) {
    }

    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public /* bridge */ /* synthetic */ void render() {
        super.render();
    }

    public /* bridge */ /* synthetic */ void setCustomParameter(String str, float f) {
        super.setCustomParameter(str, f);
    }

    public /* bridge */ /* synthetic */ void setMVPMat(float[] fArr) {
        super.setMVPMat(fArr);
    }

    public /* bridge */ /* synthetic */ void setTexMat(float[] fArr) {
        super.setTexMat(fArr);
    }

    public /* bridge */ /* synthetic */ void setTextureAlpha(float f) {
        super.setTextureAlpha(f);
    }

    public /* bridge */ /* synthetic */ void setTextureId(int i) {
        super.setTextureId(i);
    }

    public /* bridge */ /* synthetic */ void unUse() {
        super.unUse();
    }

    public /* bridge */ /* synthetic */ void use() {
        super.use();
    }

    public /* bridge */ /* synthetic */ void usePart() {
    }

    public /* bridge */ /* synthetic */ void setCustomParameter(String str, int i) {
        super.setCustomParameter(str, i);
    }
}
