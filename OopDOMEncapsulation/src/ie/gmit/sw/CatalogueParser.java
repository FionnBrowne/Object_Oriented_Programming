package ie.gmit.sw;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CatalogueParser {
	private Document doc;

	public CatalogueParser(String file) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		this.doc = db.parse(new File(file));
	}

	public String[] getproductNames() {
		var col = new ArrayList<String>();

		NodeList nodes = doc.getElementsByTagName("productName");
		for (int i = 0; i < nodes.getLength(); i++) {
			col.add(nodes.item(i).getFirstChild().getNodeValue());

		}

		return col.toArray(String[]::new);
	}

	public Product[] getProducts() {
		var products = new ArrayList<Product>();

		NodeList nodes = doc.getElementsByTagName("product");
		for (int i = 0; i < nodes.getLength(); i++) {
			Product p = new Product();
			products.add(p);

			var node = nodes.item(i);
			NamedNodeMap attributes = node.getAttributes();
			for (int j = 0; j < attributes.getLength(); j++) {
				if (attributes.item(j).getNodeName().equals("code")) {
					p.setCode(attributes.item(j).getNodeValue());
				}
			}

			NodeList children = node.getChildNodes();
			for (int j = 0; j < children.getLength(); j++) {
				Node child = children.item(j);

				if (child != null && child instanceof Element) {
					String value = child.getFirstChild().getNodeValue();
					// ,more readable
					switch (child.getNodeName()) {
					case "productName" -> p.setName(value);
					case "description" -> p.setDescription(value);
					case "manufacturer" -> p.setManufacturer(value);
					default -> p.setPrice(Float.parseFloat(value));
					}
					// works to but is longer
					/*
					 * if (child.getNodeName().equals("productName")) { p.setName(value); } else if
					 * (child.getNodeName().equals("description")) { p.setDescription(value); } else
					 * if (child.getNodeName().equals("price")) {
					 * p.setPrice(Float.parseFloat(value)); } else if
					 * (child.getNodeName().equals("manufacturer")) { p.setManufacturer(value); }
					 */
				}

			}

		}

		return products.toArray(Product[]::new);

	}
}
