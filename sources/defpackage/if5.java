package defpackage;

import one.me.sdk.media.ffmpeg.FfmpegLibraryLoader;
import one.me.sdk.media.ffmpeg.WebmConfig;

/* renamed from: if5  reason: default package */
public final /* synthetic */ class if5 implements FfmpegLibraryLoader {
    public final void load(String str) {
        try {
            System.loadLibrary("ffmpg");
        } catch (Throwable th) {
            WebmConfig.getLogger().o(th);
        }
    }
}
