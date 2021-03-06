/*******************************************************************************
 * Copyright (c) MOBAC developers
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package mobac.program.interfaces;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import mobac.program.model.TileImageType;

public interface TileImageDataWriter {

	public void initialize();
	/**
	 * Processes the <code>image</code> according to the implementation of this
	 * interfaces and saves the image data in a binary representation such as
	 * PNG, JPG, ...into the given OutputStream.
	 * 
	 * @param image
	 * @param out
	 *            {@link OutputStream} to write binary image data to (usually
	 *            this is a {@link FileOutputStream} or a
	 *            {@link ByteArrayOutputStream}
	 * @throws IOException
	 */
	public void processImage(BufferedImage image, OutputStream out) throws IOException;
	
	public void dispose();
	
	public TileImageType getType();

}
