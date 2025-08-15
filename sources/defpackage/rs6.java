package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: rs6  reason: default package */
public final class rs6 extends j47 {
    public static final Pattern y0 = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder w0 = b52.c.newDecoder();
    public final CharsetDecoder x0 = b52.b.newDecoder();

    public rs6() {
        super(17);
    }

    public final e99 w(j99 j99, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.x0;
        CharsetDecoder charsetDecoder2 = this.w0;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new e99(new vs6((String) null, (String) null, bArr));
        }
        Matcher matcher = y0.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String T = lz7.T(group);
                T.getClass();
                if (T.equals("streamurl")) {
                    str3 = group2;
                } else if (T.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new e99(new vs6(str2, str3, bArr));
    }
}
