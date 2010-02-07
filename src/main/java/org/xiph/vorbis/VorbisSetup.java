/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.xiph.vorbis;

import org.xiph.ogg.OggPacket;

/**
 * Includes extensive CODEC setup information as well as the 
 *  complete VQ and Huffman codebooks needed for decode
 */
public class VorbisSetup extends VorbisPacket {
	public VorbisSetup(OggPacket pkt) {
		super(pkt);
	}
	public VorbisSetup() {
		super();
	}
}