package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ss6  reason: default package */
public final class ss6 extends nd7 {
    public static final Pattern m = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder k = b52.c.newDecoder();
    public final CharsetDecoder l = b52.b.newDecoder();

    public final f99 n(k99 k99, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.l;
        CharsetDecoder charsetDecoder2 = this.k;
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
            return new f99(new ws6((String) null, (String) null, bArr));
        }
        Matcher matcher = m.matcher(str);
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
        return new f99(new ws6(str2, str3, bArr));
    }
}
