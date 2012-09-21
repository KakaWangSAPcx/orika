/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.inspire-software.com
 * SVN: https://geda-genericdto.svn.sourceforge.net/svnroot/geda-genericdto
 */

package ma.glasnost.orika.test.benchmarks.domain.destination;

/**
 * .
 * <p/>
 * User: denispavlov
 * Date: Sep 17, 2012
 * Time: 8:40:50 AM
 */
public class CountryDto {

    private String name;

    public CountryDto() {
    }

    public CountryDto(final String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CountryDto)) {
            return false;
        }

        CountryDto country = (CountryDto) o;

        if (name != null ? !name.equals(country.name) : country.name != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        return result;
    }
}